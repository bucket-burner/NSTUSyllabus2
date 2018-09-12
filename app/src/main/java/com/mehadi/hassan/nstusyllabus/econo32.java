package com.mehadi.hassan.nstusyllabus;



import android.os.Bundle;
import android.app.ExpandableListActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class econo32 extends  ExpandableListActivity
{
    //Initialize variables

    private int ParentClickStatus=-1;
    private int ChildClickStatus=-1;
    private ArrayList<Parent> parents;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Resources res = this.getResources();
        Drawable devider = res.getDrawable(R.drawable.line);

        // Set ExpandableListView values

        getExpandableListView().setGroupIndicator(null);
        getExpandableListView().setDivider(devider);
        getExpandableListView().setChildDivider(devider);
        getExpandableListView().setDividerHeight(1);
        registerForContextMenu(getExpandableListView());

        //Creating static data in arraylist
        final ArrayList<Parent> dummyList = buildDummyData();

        // Adding ArrayList data to ExpandableListView values
        loadHosts(dummyList);
    }

    /**
     * here should come your data service implementation
     * @return
     */
    private ArrayList<Parent> buildDummyData()
    {
        // Creating ArrayList of type parent class to store parent class objects
        final ArrayList<Parent> list = new ArrayList<Parent>();
        for (int i = 1; i < 8; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3201");
                parent.setText2("Course Title: Microeconomics-II\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Book References\n" +
                        "\n" +
                        "1. Varian, H. (1992). Microeconomic Analysis, 3rd Edition, W. W. Norton & Company, New York.\n" +
                        "\n" +
                        "2. Nicholson, W. and C. Snyder (2012). Microeconomic Theory: Basic Principles and Extensions, 11th Edition, South-Western Cengage Learning.\n" +
                        "\n" +
                        "3. Mas-Colell, A., M. Whinston and J. Green (1995). Microeconomic Theory, Oxford University Press.\n" +
                        "\n" +
                        "4. Gravelle, H. and R. Reese (2004), Microeconomics, 3rd Edition, Prentice Hall Financial Times.\n" +
                        "\n" +
                        "5. Jehle, G. and P. J. Reny (2011), Advanced Microeconomic Theory, 3rd Edition, Prentice Hall.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3203");
                parent.setText2("Course Title: Macroeconomics-II\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Book References\n" +
                        "\n" +
                        "1. Romer, D. (2012). Advanced Macroeconomics, 4th Edition, McGraw-Hill Companies, Inc.\n" +
                        "\n" +
                        "2. Blanchard, O. and D.R. Jhonson (2013). Macroeconomics, 6th Edition, Pearson Education, Inc. New Jersey, USA.\n" +
                        "\n" +
                        "3. Rode, S.J. (2012). Advanced Macroeconomics.\n" +
                        "\n" +
                        "4. Frederic, S.M. (2012). Macroeconomics: Policy and Practice, Pearson Education, Inc. Boston, USA.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3205");
                parent.setText2("Course Title: Econometrics-II\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("book References\n" +
                        "\n" +
                        "1. Wooldridge, J. M. (2005). Introductory Econometrics: A Modern Approach, 3rd Edition, South- Western College Pub.\n" +
                        "\n" +
                        "2. Judge, G. G., et. al. (1980). Theory and Practice of Econometrics, John Wiley and Sons, Inc.\n" +
                        "\n" +
                        "3. Kmenta, J. (1986). Elements of Econometrics, 2nd Edition, Macmillan, New York.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3206");
                parent.setText2("Course Title: Econometrics-II (Lab)\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Wooldridge, J. M. (2005). Introductory Econometrics: A Modern Approach, 3rd Edition, South- Western College Pub.\n" +
                        "\n" +
                        "2. Judge, G. G., et. al. (1980). Theory and Practice of Econometrics, John Wiley and Sons, Inc.\n" +
                        "\n" +
                        "3. Hamilton, L. C. (2012). Statistics with STATA: Version 12, 8th Edition, Cengage Learning.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3207");
                parent.setText2("Course Title: Environment and Natural\nResource Economics\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Field, B. C. and Field, M. K. (2006). Environmental Economics. McGraw-Hill/Irwin.\n" +
                        "\n" +
                        "2. Kolstad, C. D. (2010). Environmental Economics. Oxford University Press.\n" +
                        "\n" +
                        "3. Pearce, D. & Turner, R.K. (1990). Economics of Natural Resources and the Environment. Harvester Wheatsheaf.\n" +
                        "\n" +
                        "4. Perman, R., et. al. (2011). Natural Resource and Environmental Economics, 4th Edition, Addison Wesley.\n" +
                        "\n" +
                        "5. Tietenberg, T. and L. Lewis (2012). Environmental & Natural Resource Economics, 9th Edition, Addison Wesley.");
                parent.getChildren().add(child3);
            }

            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3209");
                parent.setText2("Course Title: Labor Economics\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Borjas, G.J. (2013). Labor Economics, 6th Edition, McGraw-Hill Companies, Inc.\n" +
                        "\n" +
                        "2. Ehrenberg, R.G. and R.S. Smith (2012). Modern Labor Economics: Theory and Public Policy, 11th Edition, Pearson Education, Inc. Boston, USA.\n" +
                        "\n" +
                        "3. Cahue, P. and A. Zylberberg (2004). Labor Economics, MIT Press.");
                parent.getChildren().add(child3);
            }

            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 3212");
                parent.setText2("Course Title: Viva Voce\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
                parent.getChildren().add(child3);
            }
//Adding Parent class object to ArrayList
            list.add(parent);
        }
        return list;
    }




    private void loadHosts(final ArrayList<Parent> newParents)
    {
        if (newParents == null)
            return;

        parents = newParents;

        // Check for ExpandableListAdapter object
        if (this.getExpandableListAdapter() == null)
        {
            //Create ExpandableListAdapter Object
            final MyExpandableListAdapter mAdapter = new MyExpandableListAdapter();

            // Set Adapter to ExpandableList Adapter
            this.setListAdapter(mAdapter);
        }
        else
        {
            // Refresh ExpandableListView data
            ((MyExpandableListAdapter)getExpandableListAdapter()).notifyDataSetChanged();
        }
    }

    /**
     * A Custom adapter to create Parent view (Used grouprow.xml) and Child View((Used childrow.xml).
     */
    private class MyExpandableListAdapter extends BaseExpandableListAdapter
    {


        private LayoutInflater inflater;

        public MyExpandableListAdapter()
        {
            // Create Layout Inflator
            inflater = LayoutInflater.from(econo32.this);
        }


        // This Function used to inflate parent rows view

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parentView)
        {
            final Parent parent = parents.get(groupPosition);

            // Inflate grouprow.xml file for parent rows
            convertView = inflater.inflate(R.layout.grouprow, parentView, false);

            // Get grouprow.xml file elements and set values
            ((TextView) convertView.findViewById(R.id.text1)).setText(parent.getText1());
            ((TextView) convertView.findViewById(R.id.text)).setText(parent.getText2());


            ImageView rightcheck=(ImageView)convertView.findViewById(R.id.rightcheck);

            //Log.i("onCheckedChanged", "isChecked: "+parent.isChecked());

            // Change right check image on parent at runtime
            if(parent.isChecked()==true){
                rightcheck.setImageResource(getResources().getIdentifier("com.androidmehadi.customexpandablelist:drawable/rightcheck",null,null));
            }
            else{
                rightcheck.setImageResource(getResources().getIdentifier("com.androidmehadi.customexpandablelist:drawable/button_check",null,null));
            }



            return convertView;
        }


        // This Function used to inflate child rows view
        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild,
                                 View convertView, ViewGroup parentView)
        {
            final Parent parent = parents.get(groupPosition);
            final Child child = parent.getChildren().get(childPosition);

            // Inflate childrow.xml file for child rows
            convertView = inflater.inflate(R.layout.childrow, parentView, false);

            // Get childrow.xml file elements and set values
            ((TextView) convertView.findViewById(R.id.text1)).setText(child.getText1());
            return convertView;
        }


        @Override
        public Object getChild(int groupPosition, int childPosition)
        {
            //Log.i("Childs", groupPosition+"=  getChild =="+childPosition);
            return parents.get(groupPosition).getChildren().get(childPosition);
        }

        //Call when child row clicked
        @Override
        public long getChildId(int groupPosition, int childPosition)
        {
            /****** When Child row clicked then this function call *******/

            //Log.i("Noise", "parent == "+groupPosition+"=  child : =="+childPosition);
            if( ChildClickStatus!=childPosition)
            {
                ChildClickStatus = childPosition;


            }

            return childPosition;
        }

        @Override
        public int getChildrenCount(int groupPosition)
        {
            int size=0;
            if(parents.get(groupPosition).getChildren()!=null)
                size = parents.get(groupPosition).getChildren().size();
            return size;
        }


        @Override
        public Object getGroup(int groupPosition)
        {
            Log.i("Parent", groupPosition+"=  getGroup ");

            return parents.get(groupPosition);
        }

        @Override
        public int getGroupCount()
        {
            return parents.size();
        }

        //Call when parent row clicked
        @Override
        public long getGroupId(int groupPosition)
        {
            Log.i("Parent", groupPosition+"=  getGroupId "+ParentClickStatus);

            if(groupPosition==2 && ParentClickStatus!=groupPosition){

                //Alert to user

            }

            ParentClickStatus=groupPosition;
            if(ParentClickStatus==0)
                ParentClickStatus=-1;

            return groupPosition;
        }

        @Override
        public void notifyDataSetChanged()
        {
            // Refresh List rows
            super.notifyDataSetChanged();
        }

        @Override
        public boolean isEmpty()
        {
            return ((parents == null) || parents.isEmpty());
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition)
        {
            return true;
        }

        @Override
        public boolean hasStableIds()
        {
            return true;
        }

        @Override
        public boolean areAllItemsEnabled()
        {
            return true;
        }



        /******************* Checkbox Checked Change Listener ********************/


        /***********************************************************************/



    }


}

