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


public class econo41 extends  ExpandableListActivity
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
                parent.setText1("Course Code: ECO 4101");
                parent.setText2("Course Title: Development Economics-I\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Book References\n" +
                        "\n" +
                        "1. Todaro, M.P. and S.C. Smith. Economic Development. 11th Edition, Addison-Wesley.\n" +
                        "\n" +
                        "2. Ray, D. (1998). Development Economics, Oxford University Press.\n" +
                        "\n" +
                        "3. Bardhan, P. and Udry, C. (1999). Development Microeconomics, Oxford University Press.\n" +
                        "\n" +
                        "4. Ghatak, S. (2005). Introduction to Development Economics. 3rd Edition, Routledge.\n" +
                        "\n" +
                        "5 Meier, G. M. and J. E. Rauch (2005). Leading issues in economic development, 8th Edition, Oxford University Press.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4103");
                parent.setText2("Course Title: Bangladesh Economy-I\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Book References\n" +
                        "\n" +
                        "1. Khan, A.R. and M. Hossain, eds. (1989), The Strategy of Development in Bangladesh, Macmillan, London.\n" +
                        "\n" +
                        "2. Van Schended: Economic history of Bangladesh.\n" +
                        "\n" +
                        "3. M.M. Akash, Bangladesh: Otit, Bortoman o Bhobishyot, Latest edition.\n" +
                        "\n" +
                        "4. Islam, S., eds. (1992). History of Bangladesh: 1704-1971, Vol. 2, (Economic History), Asiatic Society of Bangladesh, Dhaka.\n" +
                        "\n" +
                        "5. Abdullah, A., eds. (2001). Bangladesh Economy 2000: Selected Issues, BIDS, Dhaka.\n" +
                        "\n" +
                        "6. Bayes, A. and A.Muhammad, eds. (1998). Bangladesh at 25: An Analytical Discourse on Development, University Press Ltd., Dhaka.\n" +
                        "\n" +
                        "7. Book of Mofakhkharul Islam.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4105");
                parent.setText2("Course Title: International Trade\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Carbaugh, R.J. (2011). International Economics, 13th Edition, Nelson Education, Ltd. Canada.\n" +
                        "\n" +
                        "2. Krugman, P.R., et. al. (2012). International Economics: Theory & Policy, 9th Edition, Pearson Education, Inc. Boston, USA.\n" +
                        "\n" +
                        "3. Salvatore, D. (2013). International economics, 11th edition, John Wiley & Sons, Inc. New York.\n" +
                        "\n" +
                        "4. Sodersten, B. and G. Reed (1994). International Economics, 3rd Edition, Palgrave MacMillan.\n" +
                        "\n" +
                        "5. Markusen, J.R., et. al (1995). International Trade: Theory and Evidence, 1st Edition, McGraw-Hill Companies, Inc.\n" +
                        "\n" +
                        "6. Love, P. and R. Lattimore (2009). International Trade: Free, Fair and Open? OECD Insights.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4107");
                parent.setText2("Course Title: Research Methodology\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Kothari, C.R. (2004). Research Methodology: Methods and Techniques, 2nd Edition, New Age International Publishers, Ltd. New Delhi.\n" +
                        "\n" +
                        "2. Sekaran, U. (2003). Research Methods for Business: A Skill Building Approach, 4th Edition, John Wiley & Sons, Inc. New York.\n" +
                        "\n" +
                        "3. Zikmund, W.G. and B.J. Babin (2010). Essentials of Marketing Research, 4th Edition, Nelson Education, Ltd. Canada.\n" +
                        "\n" +
                        "4. Walliman, N. (2011). Research Methods: The Basics, 1st Edition, Routledge, New York.\n" +
                        "\n" +
                        "5. Shukla, P. (2008). Marketing Research, 1st Edition.\n" +
                        "\n" +
                        "6. Greener, S. and J. Martelli (2015). An Introduction to Business research Methods, 2nd Edition.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4109");
                parent.setText2("Course Title: Software Applications\nfor Economic Analysis\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. SPSS Handouts.\n" +
                        "\n" +
                        "2. STATA Handouts.\n" +
                        "\n" +
                        "3. E-Views Handouts.\n" +
                        "\n" +
                        "4. MATLAB Handouts.");
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
            inflater = LayoutInflater.from(econo41.this);
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

