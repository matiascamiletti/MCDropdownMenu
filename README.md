# MCDropdownMenu

<img src="http://www.mobileia.com/github/OBHL1o.gif" />

Preview: http://youtu.be/CBqn5tkwXWQ

# Usage

<pre>
MCDropdownMenu mMenu = (MCDropdownMenu)findViewById(R.id.menu);
mMenu.setLayoutMainView(R.layout.menu_main_view);
mMenu.setAdapter(adapter);
mMenu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
   @Override
    public void onSelected(View listview, int selectedIndex) {
        Toast.makeText(MainActivity.this, "Position: " + selectedIndex, Toast.LENGTH_SHORT).show();
    }
});
</pre>

# Install
<pre>
dependencies {
    compile 'com.mobileia:mc-dropdown-menu:0.1.3'
}
</pre>
