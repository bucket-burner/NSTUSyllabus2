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


public class bba41 extends  ExpandableListActivity
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
//parent.setText1("Course Code: BBA 3201");
                parent.setText2("Course Title:\n1st Major/ Concentration\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("ACCOUNTING AND INFORMATION SYSTEMS:\n" +
                        "\n" +
                        "Course Code: AIS  4101\n" +
                        "Course Title: Accounting Information System\n" +
                        "\n" +
                        "FINANCE AND BANKING:\n" +
                        "\n" +
                        "Course Code: FIN 4101\n" +
                        "Course Title: Financial Information Analysis\n" +
                        "\n" +
                        "MANAGEMENT STUDIES:\n" +
                        "\n" +
                        "Course Code: MGT 4101\n" +
                        "Course Title: Total Quality Management\n" +
                        "\n" +
                        "HUMAN RESOURCE MANAGEMENT:\n" +
                        "\n" +
                        "Course Code: HRM 4101\n" +
                        "Course Title: Human Recourse Planning\n" +
                        "\n" +
                        "MARKETING:\n" +
                        "\n" +
                        "Course Code: MKT 4101\n" +
                        "Course Title: Basic Marketing Research\n");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
//parent.setText1("Course Code: BBA 3203");
                parent.setText2("Course Title:\n2nd Major/ Concentration\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("ACCOUNTING AND INFORMATION SYSTEMS:\n" +
                        "\n" +
                        "Course Code: AIS  4103\n" +
                        "Course Title: Financial Information Analysis\n" +
                        "\n" +
                        "FINANCE AND BANKING:\n" +
                        "\n" +
                        "Course Code: FIN 4103\n" +
                        "Course Title: Corporate Finance\n" +
                        "\n" +
                        "MANAGEMENT STUDIES:\n" +
                        "\n" +
                        "Course Code: MGT 4103\n" +
                        "Course Title: Managerial Economics\n" +
                        "\n" +
                        "HUMAN RESOURCE MANAGEMENT:\n" +
                        "\n" +
                        "Course Code: HRM 4103\n" +
                        "Course Title: Compensation Management\n" +
                        "\n" +
                        "MARKETING:\n" +
                        "\n" +
                        "Course Code: MKT 4103\n" +
                        "Course Title: Consumer Behavior\n");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
//parent.setText1("Course Code: BBA 3205");
                parent.setText2("Course Title:\n3rd Major/ Concentration\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("ACCOUNTING AND INFORMATION SYSTEMS:\n" +
                        "\n" +
                        "Course Code: AIS  4105\n" +
                        "Course Title: Advanced Accounting \n" +
                        "\n" +
                        "FINANCE AND BANKING:\n" +
                        "\n" +
                        "Course Code: FIN 4105\n" +
                        "Course Title: Bank Management\n" +
                        "\n" +
                        "MANAGEMENT STUDIES:\n" +
                        "\n" +
                        "Course Code: MGT 4105\n" +
                        "Course Title: Management of Foreign Trade\n" +
                        "\n" +
                        "HUMAN RESOURCE MANAGEMENT:\n" +
                        "\n" +
                        "Course Code: HRM 4105\n" +
                        "Course Title: Human Resource Development\n" +
                        "\n" +
                        "MARKETING:\n" +
                        "\n" +
                        "Course Code: MKT 4105\n" +
                        "Course Title: Sales Force Management\n");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BBA 4107");
                parent.setText2("Course Title: Business Research\nMethodology\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Course Category:\n" +
                        "\n" +
                        "Combined Course");
                parent.getChildren().add(child3);
            }

            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BBA 4109");
                parent.setText2("Course Title: International Business\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Course Category:\n" +
                        "\n" +
                        "Combined Course");
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
            inflater = LayoutInflater.from(bba41.this);
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

