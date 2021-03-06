package edu.suu.nursingapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

import edu.suu.nursingapp.fragment.assessmentFragment;
import edu.suu.nursingapp.fragment.objectiveFragment;
import edu.suu.nursingapp.fragment.planFragment;
import edu.suu.nursingapp.fragment.subjectiveFragment;
import edu.suu.nursingapp.fragment.vitalsFragment;
import edu.suu.nursingapp.objects.patient;


public class soapActivity extends ActionBarActivity implements ActionBar.TabListener {

    private static patient currentPatient;
    final Context context = this;
    SectionsPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;
    String vitalsTag, subjectiveTag, objectiveTag, assessmentTag, planTag;
    private Button button;

    public static patient getCurrentPatient() {
        return currentPatient;
    }

    public void setCurrentPatient(patient currentPatient) {
        this.currentPatient = currentPatient;
        System.out.println("************Save complete***********");
    }

    public void savePatient() {
        FragmentManager fm = getSupportFragmentManager();
        vitalsFragment vf = (vitalsFragment) fm.findFragmentByTag(vitalsTag);
        vf.saveVitals();

        subjectiveFragment sf = (subjectiveFragment) fm.findFragmentByTag(subjectiveTag);
        sf.saveSubjective();

        objectiveFragment of = (objectiveFragment) fm.findFragmentByTag(objectiveTag);
        of.saveObjective();

        assessmentFragment af = (assessmentFragment) fm.findFragmentByTag(assessmentTag);
        af.saveAssessment();

        planFragment pf = (planFragment) fm.findFragmentByTag(planTag);
        pf.savePlan();
    }

    public void receivePatient() {
        currentPatient = (patient) getIntent().getSerializableExtra("intentkey");

    }

    public void pushCurrentPatientToServer(View v) {
        ApiConnector api = new ApiConnector();
        api.sendJSON(currentPatient);
        System.out.println("************PUSH COMPLETE***********");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soap);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        receivePatient();


        // Set up the action bar.
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        // For each of the sections in the app, add a tab to the action bar.
        for (int i = 0; i < 5; i++) {
            // Create a tab with text corresponding to the page title defined by
            // the adapter. Also specify this Activity object, which implements
            // the TabListener interface, as the callback (listener) for when
            // this tab is selected.
            actionBar.addTab(
                    actionBar.newTab()
                            .setText(mSectionsPagerAdapter.getPageTitle(i))
                            .setTabListener(this));
        }
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

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        // When the given tab is selected, switch to the corresponding page in
        // the ViewPager.
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    public void onPopUp(View arg1) {
        mViewPager.setCurrentItem(0, true);

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog);
        dialog.setTitle("Submit Test");

        TextView text = (TextView) dialog.findViewById(R.id.text);
        text.setText("Are you sure you want to submit? No changes will be allowed afterwards.");

        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

                pushCurrentPatientToServer(v);
            }
        });

        Button dialogButton2 = (Button) dialog.findViewById(R.id.dialogButtonCancel);
        dialogButton2.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(4, true);
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            switch (position) {
                case 0:
                    vitalsFragment vf = new vitalsFragment();
                    vitalsTag = vf.getTag();
                    return vf;
                case 1:
                    subjectiveFragment sf = new subjectiveFragment();
                    subjectiveTag = sf.getTag();
                    return sf;
                case 2:
                    objectiveFragment of = new objectiveFragment();
                    objectiveTag = of.getTag();
                    return of;
                case 3:
                    assessmentFragment af = new assessmentFragment();
                    assessmentTag = af.getTag();
                    return af;
                case 4:
                    planFragment pf = new planFragment();
                    planTag = pf.getTag();
                    return pf;
            }
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 5 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section0).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 3:
                    return getString(R.string.title_section3).toUpperCase(l);
                case 4:
                    return getString(R.string.title_section4).toUpperCase(l);
            }
            return null;
        }
    }

}

























