 # Android界面组件实验
 - 利用SimpleAdapter实现如下界面效果
![图片](screenshot/1.png)
   1. 代码思路：用simpleAdapter组装列表组件再将其放入列表中
   2. 关键代码：
```public class MainActivity4 extends AppCompatActivity {
    private String[] docs = new String[]{"Lion","Tiger","Monkey","Dog","Cat","elephant"};
    private int[] imgs = new int[]{R.drawable.lion, R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        List<Map<String,Object>> listitems = new ArrayList<>();
        for (int i = 0; i < docs.length; i++) {
            Map<String,Object> listitem = new HashMap<>();
            listitem.put("doc",docs[i]);
            listitem.put("img",imgs[i]);
            listitems.add(listitem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listitems,R.layout.simple_item,new String[]{"doc","img"},new int[]{R.id.doc,R.id.img});
        ListView list = findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener((adapterView, view, i, l) -> {
            view.setBackgroundColor(R.color.purple_500);
            String s = docs[i];
            Toast.makeText(MainActivity4.this,s,Toast.LENGTH_SHORT).show();
        });
    }
} ```