

package com.mehadi.hassan.nstusyllabus;



import android.os.Bundle;
import android.app.ExpandableListActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class cste12 extends  ExpandableListActivity
{



    private ArrayList<Parent> parents;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);





        getExpandableListView().setGroupIndicator(null);

        getExpandableListView().setDividerHeight(1);
        registerForContextMenu(getExpandableListView());


        final ArrayList<Parent> dummyList = buildDummyData();


        loadHosts(dummyList);
    }


    private ArrayList<Parent> buildDummyData()
    {
        // Creating ArrayList of type parent class to store parent class objects
        final ArrayList<Parent> list = new ArrayList<Parent>();
        for (int i = 1; i < 12; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1201");
                parent.setText2("Course Title: Structured Programming Language\nCredit: 3.00");

            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1202");
                parent.setText2("Course Title: Structured Programming Language\nLab\nCredit: 1.00  ");

            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1203");
                parent.setText2("Course Title: Discrete Mathematics\nCredit: 3.00");

            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1205");
                parent.setText2("Course Title: Electric Circuit Analysis\nCredit: 3.00");

            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1206");
                parent.setText2("Course Title: Electric Circuit Analysis\nLab\nCredit: 1.00");

            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1207");
                parent.setText2("Course Title: Electronic Devices and\nCircuits-II\nCredit: 2.00");

            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1208");
                parent.setText2("Course Title: Electronic Devices and\nCircuits Lab\nCredit: 1.00");

            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: MATH 1203");
                parent.setText2("Course Title: Matrices,Ordinary and Partial\nDifferential equations\nCredit: 3.00");

            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: HUM 1203");
                parent.setText2("Course Title: Industrial and Business Management\nCredit: 2.00");

            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code: BLWS 1201");
                parent.setText2("Course Title: Bangladesh Liberation War\nStudies\nCredit: 3.00");

            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code: CSTE 1226");
                parent.setText2("Course Title: Viva Voce\nCredit: 1.00");

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
            inflater = LayoutInflater.from(cste12.this);
        }


        // This Function used to inflate parent rows view

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded,
                                 View convertView, ViewGroup parentView)
        {
            final Parent parent = parents.get(groupPosition);

            // Inflate grouprow.xml file for parent rows
            convertView = inflater.inflate(R.layout.grouprow1, parentView, false);

            // Get grouprow.xml file elements and set values
            ((TextView) convertView.findViewById(R.id.text1)).setText(parent.getText1());
            ((TextView) convertView.findViewById(R.id.text)).setText(parent.getText2());





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