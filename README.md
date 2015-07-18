# MCDropdownMenu

<iframe width="420" height="315" src="https://www.youtube.com/embed/CBqn5tkwXWQ" frameborder="0" allowfullscreen></iframe>
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
