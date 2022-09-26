# ### HelloWorld
-HelloWorld
![HelloWorld](shotscreen/helloworld.png)

-LayOut
#代码
``` LearLayOut
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        app:layout_constraintBottom_toBottomOf="parent"
        tools:layout_editor_absoluteX="0dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="90dp"
            android:orientation="horizontal">

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="One,One" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView1"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="One,Two" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView2"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="One,Three" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView3"
                android:layout_width="wrap_content"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_weight="1"
                android:gravity="center"
                android:text="One,Four" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="82dp"
            android:orientation="horizontal">

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView4"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Two,One" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView5"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Two,Two" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView6"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Two,Three" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView7"
                android:layout_width="30dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Two,Four" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="82dp"
            android:orientation="horizontal">

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView8"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Three,One" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView9"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Three,Two" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView10"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Three,Three" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView11"
                android:layout_width="30dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Three,Four" />

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="82dp"
            android:orientation="horizontal">

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView12"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Four,One" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView13"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Four,Two" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView14"
                android:layout_width="25dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_marginRight="5dp"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Four,Three" />

            <TextView
                android:background="@drawable/border_f"
                android:id="@+id/textView15"
                android:layout_width="30dp"
                android:layout_height="76dp"
                android:layout_gravity="center"
                android:layout_weight="1"
                android:gravity="center"
                android:text="Four,Four" />

        </LinearLayout>
    </LinearLayout>
```