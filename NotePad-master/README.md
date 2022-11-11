# NotePad
 ###时间戳
 1.思路：从数据库把修改时间拿出来
 2.运行截图：
 ! [时间戳](shotscreen/1.png)
 3。关键代码：
 ```
 private static final String[] PROJECTION = new String[] {
            NotePad.Notes._ID, // 0
            NotePad.Notes.COLUMN_NAME_TITLE, // 1
            NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE,  //4
    };

String[] dataColumns = { NotePad.Notes.COLUMN_NAME_TITLE, NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE} ;

 int[] viewIDs = { android.R.id.text1,R.id.text2 };
 ```
 ###查找功能
 1.思路：从数据库把修改时间拿出来
 2.运行截图：
 ! [查找(shotscreen/2.png)
 3。关键代码：
 ```
 <SearchView
        android:id="@+id/sv_search"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@drawable/shape_purple"
        android:iconifiedByDefault="false" />
    <ListView
        android:id="@+id/lv_search"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />

  rDB = MyDBHelper.getInstance(this).getrDB(); //获取数据库读权限
        search.setSubmitButtonEnabled(true);
        search.setQueryHint("查找");
        search.setOnQueryTextListener(this);

  String selection1 = NotePad.Notes.COLUMN_NAME_TITLE+" like ? or "+NotePad.Notes.COLUMN_NAME_NOTE+" like ?";

   String[] selection2 = {"%"+s+"%","%"+s+"%"};

 ```