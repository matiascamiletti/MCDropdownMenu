package com.mobileia.mcdropdownmenu.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.mobileia.mcdropdownmenu.MCDropdownMenu;
import com.mobileia.mcdropdownmenu.OnMenuSelectedListener;


public class MainActivity extends Activity {

    MCDropdownMenu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create adapter
        MenuAdapter adapter = new MenuAdapter(this);
        adapter.addItem(new MenuItem(1, "Item 1"));
        adapter.addItem(new MenuItem(2, "Item 2"));
        adapter.addItem(new MenuItem(3, "Item 3"));
        adapter.addItem(new MenuItem(4, "Item 4"));
        adapter.addItem(new MenuItem(5, "Item 5"));
        adapter.addItem(new MenuItem(6, "Item 6"));
        adapter.addItem(new MenuItem(7, "Item 7"));
        adapter.addItem(new MenuItem(8, "Item 8"));
        adapter.addItem(new MenuItem(9, "Item 9"));
        adapter.addItem(new MenuItem(10, "Item 10"));
        adapter.addItem(new MenuItem(11, "Item 11"));
        adapter.addItem(new MenuItem(11, "Item 12"));
        adapter.addItem(new MenuItem(11, "Item 13"));
        adapter.addItem(new MenuItem(11, "Item 14"));

        mMenu = (MCDropdownMenu)findViewById(R.id.menu);
        mMenu.setLayoutMainView(R.layout.menu_main_view);
        mMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onSelected(View listview, int selectedIndex) {
                Toast.makeText(MainActivity.this, "Position: " + selectedIndex, Toast.LENGTH_SHORT).show();
            }
        });
        mMenu.setAdapter(adapter);

        TextView title = (TextView)mMenu.findViewById(R.id.textView2);
        title.setText("Home");
    }

}
