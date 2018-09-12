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


public class econo21 extends  ExpandableListActivity
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
        for (int i = 1; i < 6; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2101");
                parent.setText2("Course Title: Intermediate\nMicroeconomics-I\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Book References\n" +
                        "\n" +
                        "1. Hal R Varian, Intermediate Microeconomics, Third Edition.\n" +
                        "\n" +
                        "2. Koutsoyiannis, A. Modern Microeconomics, English Language Book Society/ MacMillan, London, 1998.\n" +
                        "\n" +
                        "3. Hirschleifer, J., Glazer, A. and D. Hirsheleifer (2005). Price Theory and Applications, 5th Edition, Cambridge University Press.\n" +
                        "\n" +
                        "4. Samuelson, Paul A. and William, D. Nordhaus. Economics, McGraw-Hill Book Company, New York, 2005.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2103");
                parent.setText2("Course Title: Intermediate\nMacroeconomics-I\nCredit: 4 .00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Book References\n" +
                        "\n" +
                        "1. O’Sullivan, A., et. al. (2014). Macroeconomics: Principles, Applications, and Tools. 8th Edition, Pearson Education, Inc. New Jersey, USA.\n" +
                        "\n" +
                        "2. Karl, E.C., et. al. (2012). Principles of Macroeconomics, 10th Edition, Pearson Education, Inc. Boston, USA.\n" +
                        "\n" +
                        "3. Mankiw, N.G. (2012). Principles of Macroeconomics, 6th Edition, Nelson Education, Ltd.\n" +
                        "\n" +
                        "4. Taslim, M.A. and A. Chowdhury (1995). Macroeconomic Analysis for Australian Students, Prentice Hall, Sydney.\n" +
                        "\n" +
                        "5. Parkin, M. and R. Bade (2012). Macroeconomics, Canada and the Global Environment, 8th Edition, Pearson Higher Education, Canada.\n" +
                        "\n" +
                        "6. Dornbusch R. and S. Fischer, Macroeconomics, Latest edition.\n" +
                        "\n" +
                        "7. Blanchard, O. and D.R. Jhonson (2013). Macroeconomics, 6th Edition, Pearson Education, Inc. New Jersey, USA.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2105");
                parent.setText2("Course Title: Mathematical Economics\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Dowling, E. T. (2001). Theory and Problems of Introduction to Mathematical Economics, Schaum’s Outline Series, 3rd Edition, McGraw-Hill.\n" +
                        "\n" +
                        "2. Chiang A C. and K. Wainwright (2005). Fundamental Methods of Mathematical Economics, 4th Edition, McGraw-Hill.\n" +
                        "\n" +
                        "3. Hoy, M., et al (2011). Mathematics for Economics, 3rd Edition. The MIT Press, Cambridge, Massachusetts.\n" +
                        "\n" +
                        "4. Simon, C. P. and L. Bloom (1994). Mathematics for Economists, W.W. Norton and Company.\n" +
                        "\n" +
                        "5. D.C. Sancheti & V.K. Kapoor, Business Mathematics.\n" +
                        "\n" +
                        "6. Dr. Md. Rafiqul Islam & Mohammad Osman Gani, Business Mathematics");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2107");
                parent.setText2("Course Title: Money, Banking and Finance\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Stephen, R. A., Westerfield, R. W. and J. Jafee (2002). Corporate Finance, 6th Edition, McGraw-Hill.\n" +
                        "\n" +
                        "2. Brigham E. F. and J.F. Liaison (1998). Fundamentals of Fraternal Management, the Dryden Press.\n" +
                        "\n" +
                        "3. Mishkin, F. S. (2000). The Economics of Money Banking, and Financial Markets, Addison -Wesley.\n" +
                        "\n" +
                        "4. Modigliani, F., P., Frank, J. Jones and F. J. Fabozzi (2009). Foundations of Financial Markets and Institutions, Prentice Hall.\n" +
                        "\n" +
                        "5. Brealey, R.A., Myers, S.C. and A.J. Marcus (2007), Principles of Corporate Finance, 7th Edition, McGraw-Hill, Inc");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 2109");
                parent.setText2("Course Title: Political Science\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Downs, A. (1957). An Economic Theory of Democracy, N. Y. Harper, New York.\n" +
                        "\n" +
                        "2. Heilbroner, R. L. (1999). The Worldly Philosophers. The Lives, Times, and Ideas of the Great Economic Thinkers, Simon and Schuster, New York.\n" +
                        "\n" +
                        "3. Weber, M. (2003). The Protestant Ethic and the Spirit of Capitalism, Minoela, Dover Publications, New York.\n" +
                        "\n" +
                        "4. Shively, W. P. (2008). Power and Choice, 11thEdition, McGraw-Hill.");
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
            inflater = LayoutInflater.from(econo21.this);
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

