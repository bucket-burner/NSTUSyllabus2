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


public class econo12 extends  ExpandableListActivity
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
                parent.setText1("Course Code: ECO 1201");
                parent.setText2("Course Title: Introductory Macroeconomics\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Book References\n" +
                        "\n" +
                        "1. Samuelson, Paul A. and William, D. Nordhaus. Economics, McGraw-Hill Book Company, New york, 2005.\n" +
                        "\n" +
                        "2. Barro, R. J., Macroeconomics, 5th Edition, the MIT Press.\n" +
                        "\n" +
                        "3. Mankiw, G. N. (2012). Macroeconomics, 8h Edition, Worth Publishers, Inc.\n" +
                        "\n" +
                        "4. Brue, McConnell, and Flynn, Macroeconomics: Principles, Problems, and Policies, Latest Edition.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1203");
                parent.setText2("Course Title: Mathematics\nfor Economists-II\nCredit: 4 .00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Book References\n" +
                        "\n" +
                        "1. Dowling, E. T. (2001). Theory and Problems of Introduction to Mathematical Economics, Schaum’s Outline Series, 3rd Edition, McGraw-Hill.\n" +
                        "\n" +
                        "2. Chiang A C. and K. Wainwright (2005). Fundamental Methods of Mathematical Economics, 4th Edition, McGraw-Hill.\n" +
                        "\n" +
                        "3. Simon, C. P. and L. Bloom (1994). Mathematics for Economists, W.W. Norton and Company.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1205");
                parent.setText2("Course Title: Statistics-II\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Anderson, D. R., et. al.; Statistics for Business and Economics, Cengage Learning.\n" +
                        "\n" +
                        "2. Murry R. Spiegel. Theory & Problems of Statistics, Latest Edition.\n" +
                        "\n" +
                        "3. Newbold, P., Carlson, W. L. and B. Thorne; Statistics for Business and Economics, Prentice Hall.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1207");
                parent.setText2("Course Title: Principles of Accounting\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Weygandt, J.J, Kimmel, P.D. and D. E. Kieso (2013). Accounting Principles, 11th Edition, Wiley.\n" +
                        "\n" +
                        "2. Pyle, W. W. and K. D. Larson (1990). Fundamentals of Accounting Principles, 12th Edition, Mc-Graw Hill, Inc.\n" +
                        "\n" +
                        "3. Needles, B. E. Jr, et. al. (2011). Principles of Accounting, 11th Edition, Cengage Learning.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1209");
                parent.setText2("Course Title: Introduction to Computer\nAnalysis and Communication-II\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Sinha, P. K. (2004). Computer Fundamentals, BPB Publications.\n" +
                        "\n" +
                        "2. Norton, P. (2005). Introduction to Computer, McGraw-Hill.\n" +
                        "\n" +
                        "3. Kosiur, D. (1997). Understanding Electronic Commerce, Microsoft Press, Washington.\n" +
                        "\n" +
                        "4. Bajaj, K. K. and D. Nag (1999). E Commerce-The Cutting Edge of Business, TATA McGraw-Hill Publishers.\n" +
                        "\n" +
                        "5. Brook-Hart, Guy (2008). Complete First Certificate. Cambridge: Cambridge University Press.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1212");
                parent.setText2("Course Title: Application of Mathematics\nand Statistics\nin Economics-II (Lab)\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "1. Dowling, E. T.; Theory and Problems of Introduction to Mathematical Economics, Schaum’s Outline Series, 3rd Edition, McGraw-Hill.\n" +
                        "\n" +
                        "2. Chiang A C. and K. Wainwright. Fundamental Methods of Mathematical Economics, 4th Edition, McGraw-Hill.\n" +
                        "\n" +
                        "3. Steel, R.G.D. and J.H. Torrie, Principles and procedures of Statistics, McGraw Hill Book Co. Inc. NewYork.\n" +
                        "\n" +
                        "4. Yule, G.U. & M.G.Kendall, An Introduction to the Theory of Statistics, Charles Griffin, London.");
                parent.getChildren().add(child3);
            }

            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 1214");
                parent.setText2("Course Title: Viva Voce\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "1. Dowling, E. T.; Theory and Problems of Introduction to Mathematical Economics, Schaum’s Outline Series, 3rd Edition, McGraw-Hill.\n" +
                        "\n" +
                        "2. Chiang A C. and K. Wainwright. Fundamental Methods of Mathematical Economics, 4th Edition, McGraw-Hill.\n" +
                        "\n" +
                        "3. Steel, R.G.D. and J.H. Torrie, Principles and procedures of Statistics, McGraw Hill Book Co. Inc. NewYork.\n" +
                        "\n" +
                        "4. Yule, G.U. & M.G.Kendall, An Introduction to the Theory of Statistics, Charles Griffin, London.");
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
            inflater = LayoutInflater.from(econo12.this);
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

