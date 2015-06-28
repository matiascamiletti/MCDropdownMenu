# MCDropdownMenu

Preview: http://youtu.be/CBqn5tkwXWQ

# Usage

* MCDropdownMenu mMenu = (MCDropdownMenu)findViewById(R.id.menu);
* mMenu.setLayoutMainView(R.layout.menu_main_view);
* mMenu.setAdapter(adapter);
* mMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
*     @Override
*     public void onSelected(View listview, int selectedIndex) {
*         Toast.makeText(MainActivity.this, "Position: " + selectedIndex, Toast.LENGTH_SHORT).show();
*     }
* });
