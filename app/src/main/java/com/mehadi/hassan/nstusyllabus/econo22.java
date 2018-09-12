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


public class econo22 extends  ExpandableListActivity
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
        for (int i = 1; i < 7; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2201");
                parent.setText2("Course Title: Intermediate\nMicroeconomics-II\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References\n" +
                        "\n" +
                        "1. Hal R. Varian, Intermediate Micro Economics.\n" +
                        "\n" +
                        "2. Rich H. Leftwich, The Price system and Resource Allocation, Latest Edition.\n" +
                        "\n" +
                        "3. James M. Henderson, Richard E. Quandt. Micro Economic Theory: A Mathematical Approach, Latest Edition.\n" +
                        "\n" +
                        "4. A Koutsoyiannis, Modern Micro Economics, Latest Edition.\n" +
                        "\n" +
                        "5. Pindyck, R. S. and D. L. Rubinfeld (2012). Microeconomics, 8th Edition, Pearson Education.\n" +
                        "\n" +
                        "6. Nicholson, W. and C. Snyder (2009), Intermediate Microeconomics and Its Application, 11th Edition, Cengage Learning.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2203");
                parent.setText2("Course Title: Intermediate\nMacroeconomics-II\nCredit: 4 .00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References\n" +
                        "\n" +
                        "1. Frederic, S.M. (2012). Macroeconomics: Policy and Practice, Pearson Education, Inc. Boston, USA.\n" +
                        "\n" +
                        "2. O’Sullivan, A., et. al. (2014). Macroeconomics: Principles, Applications, and Tools. 8th Edition, Pearson Education, Inc. New Jersey, USA.\n" +
                        "\n" +
                        "3. Karl, E.C., et. al. (2012). Principles of Macroeconomics, 10th Edition, Pearson Education, Inc. Boston, USA.\n" +
                        "\n" +
                        "4. Mankiw, N.G. (2012). Principles of Macroeconomics, 6th Edition, Nelson Education, Ltd.\n" +
                        "\n" +
                        "5. Blanchard, O. and D.R. Jhonson (2013). Macroeconomics, 6th Edition, Pearson Education, Inc. New Jersey, USA.\n" +
                        "\n" +
                        "6. Abel, A.B., et. al. (2011). Macroeconomics, 7th Edition, Pearson Education, Inc. Boston, USA.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2205");
                parent.setText2("Course Title: Statistical Methods\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. Kmenta, J.; Elements of Econometrics, 2nd Edition, Macmillan, New York.\n" +
                        "\n" +
                        "2. Anderson, D. R., et. al.; Statistics for Business and Economics, Cengage Learning.\n" +
                        "\n" +
                        "3. Newbold, P., Carlson, W. L. and B. Thorne; Statistics for Business and Economics, Prentice Hall.\n" +
                        "\n" +
                        "4. Wooldridge, J. M.; Introductory Econometrics: A Modern Approach, 3rd Edition, South-Western College Pub.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2207");
                parent.setText2("Course Title: Public Economics\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. Stiglitz, J.E. (2000). Economics of Public Sector, 3rd Edition, Norton & company.\n" +
                        "\n" +
                        "2. Seidman, L.S. (2011). Public Finance, 1st Edition, McGraw-Hill Companies, Inc.\n" +
                        "\n" +
                        "3. Tresch, R.W. (2015). Public Finance: A Normative Theory, 3rd Edition, American Press.\n" +
                        "\n" +
                        "4. Gruber, J. (2005). Public finance and Public Policy. Worth Publishers, New York.\n" +
                        "\n" +
                        "5. Rosen, H. (2005). Public Finance, McGraw-Hill Companies, Inc.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2209");
                parent.setText2("Course Title: Principles of Sociology\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. Brinkerhoff, D.B., et. al. (2011). Essentials of Sociology, 8th Edition, Nelson Education, Ltd. Canada.\n" +
                        "\n" +
                        "2. Macionis, J.M. (2004). Sociology. Pearson, Toronto.\n" +
                        "\n" +
                        "3. Giddens, A. (2009). Sociology. Polity Press, Cambridge.\n" +
                        "\n" +
                        "4. Andersen, M.L. and H.F. Taylor (2013). Sociology: The Essentials, 7th Edition, Nelson Education, Ltd. Canada.\n" +
                        "\n" +
                        "5. Rao, C.N. Shanker. (2001). Sociology: Primary Principles, S. Chand & Company Limited, New Delhi.");
                parent.getChildren().add(child3);
            }

            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2212");
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
            inflater = LayoutInflater.from(econo22.this);
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

