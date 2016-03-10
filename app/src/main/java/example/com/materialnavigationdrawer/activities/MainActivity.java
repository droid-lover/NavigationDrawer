package example.com.materialnavigationdrawer.activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;
import example.com.materialnavigationdrawer.R;
import example.com.materialnavigationdrawer.fragments.ButterknifeFragment;
import example.com.materialnavigationdrawer.fragments.CricinfoFragment;
import example.com.materialnavigationdrawer.fragments.DraftFragment;
import example.com.materialnavigationdrawer.fragments.GoogleFragment;
import example.com.materialnavigationdrawer.fragments.InboxFragment;
import example.com.materialnavigationdrawer.fragments.SentMailFrag;
import example.com.materialnavigationdrawer.fragments.StarredFragment;

/**
 * Created by jarvis on 10-Mar-16
 * at  11:52 AM .
 */
public class MainActivity  extends AppCompatActivity {

    //Defining Variables
    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.navigation_view)
    NavigationView navigationView;

    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //  setting it as the actionbar
        setSupportActionBar(toolbar);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.frame, new InboxFragment());
        tx.commit();
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) menuItem.setChecked(false);
                else menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {


                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.inbox:
                        InboxFragment contentFragment = new InboxFragment();
                        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.frame, contentFragment);
                        fragmentTransaction1.commit();
                        toolbar.setTitle("Inbox Fragment");
                        return true;

                    case R.id.starred:
                        StarredFragment starredFragment = new StarredFragment();
                        FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.frame, starredFragment);
                        fragmentTransaction2.commit();
                        toolbar.setTitle("Starred Fragment");
                        return true;
                    case R.id.sent_mail:
                        SentMailFrag sentMailFragment = new SentMailFrag();
                        FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.frame, sentMailFragment);
                        fragmentTransaction3.commit();
                        toolbar.setTitle("Sent Maill Fragment");
                        return true;
                    case R.id.drafts:
                        DraftFragment draftFragment = new DraftFragment();
                        FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.frame, draftFragment);
                        fragmentTransaction4.commit();
                        toolbar.setTitle("Drafts Fragment");
                        return true;
                    case R.id.google:
                        GoogleFragment googleFragment = new GoogleFragment();
                        FragmentTransaction fragmentTransaction5 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction5.replace(R.id.frame, googleFragment);
                        fragmentTransaction5.commit();
                        toolbar.setTitle("Google Fragment");
                        return true;
                    case R.id.cricinfo:
                        CricinfoFragment cricinfoFragment = new CricinfoFragment();
                        FragmentTransaction fragmentTransaction6 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction6.replace(R.id.frame, cricinfoFragment);
                        fragmentTransaction6.commit();
                        toolbar.setTitle("CricInfo");
                        return true;
                    case R.id.butterknife:
                        ButterknifeFragment butterknifeFragment = new ButterknifeFragment();
                        FragmentTransaction fragmentTransaction7 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction7.replace(R.id.frame, butterknifeFragment);
                        fragmentTransaction7.commit();
                        toolbar.setTitle("ButterKnife Fragment");
                        return true;
                    default:
                        InboxFragment inboxFragment = new InboxFragment();
                        FragmentTransaction fragmentTransactionDefault = getSupportFragmentManager().beginTransaction();
                        fragmentTransactionDefault.replace(R.id.frame, inboxFragment);
                        fragmentTransactionDefault.commit();
                        toolbar.setTitle("Inbox default");
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
