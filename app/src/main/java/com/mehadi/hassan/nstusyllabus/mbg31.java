
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


public class mbg31 extends  ExpandableListActivity
{


    private int ParentClickStatus=-1;
    private int ChildClickStatus=-1;
    private ArrayList<Parent> parents;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Resources res = this.getResources();
        Drawable devider = res.getDrawable(R.drawable.line);



        getExpandableListView().setGroupIndicator(null);
        getExpandableListView().setDivider(devider);
        getExpandableListView().setChildDivider(devider);
        getExpandableListView().setDividerHeight(1);
        registerForContextMenu(getExpandableListView());


        final ArrayList<Parent> dummyList = buildDummyData();


        loadHosts(dummyList);
    }


    private ArrayList<Parent> buildDummyData()
    {
        // Creating ArrayList of type parent class to store parent class objects
        final ArrayList<Parent> list = new ArrayList<Parent>();
        for (int i = 1; i < 13; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3101");
                parent.setText2("Course Title:BASIC IMMUNOLOGY I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Books Recommended\n1.	Immunology – Roitt I\n2.	Roitt’s Essential Immunology – Delves P, Martin S, Burton D and Roitt I\n3.	Advanced Immunology – Male DK, Champion B and Cooke A\n4.	Text Book of Immunology – Barrett TJ\n5.	Immunology: An introduction – Tizard TR");

                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3103");
                parent.setText2("Course Title:INTRODUCTORY VIROLOGY\nCredit:2.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Books Recommended\n1.	Microbiology: Concepts and Applications – Pelczer MJ Jr, Chan ECS and Krieg NR2\n2.	Biology of Microorganisms – Brock TD, Madigan MT, Martinko JM and Parker J\n3.	Fields Virology, Vol. I and II – Knipe DM, Roizman B, Howley PM, Straus SE and Griffin DE\n4.	Fundamental Virology – Fields BN, Knipe DM and Howley PM");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3105");
                parent.setText2("Course Title:MICROBIAL MOLECULAR\nGENETICS\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Books Recommended\n1.	Principles of Genetics – Gardner EJ, Simmon MJ  and Snustad DP\n2.	Molecular Biology of Gene – Watson JD et al.\n3.	Gene VI – Lewin B\n4.	Principles of Genetics –  Snustad DP, Simmon MJ");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3107");
                parent.setText2("Course Title:FOOD MICROBIOLOGY\nCredit:2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book Recommended\n1.	Food Microbiology – Frazier WC and Westhoff DC\n2.	Modern Food Microbiology – Jay JM");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3109");
                parent.setText2("Course Title:ENZYMOLOGY\nCredit:2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Books Recommended\n1.	Lehninger Principle of Biochemistry – Nelson DL & Cox MM\n2.	Biochemical Engineering Fundamental – Bailey JE & Ollis D");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3111");
                parent.setText2("Course Title:INDUSTRIAL MICROBIOLOGY\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Books Recommended\n1.	Industrial Microbiology – Miller BM and Litsky  W\n2.	Industrial Microbiology: An Introduction- Michael J. Waites, Neil L. Morgan, John S. Rockey\n3.	Microbial Biotechnology: Fundamentals of Applied Microbiology- Alexander N. Glazer, Hiroshi Nikaido\n4.	Molecular Biotechnology: Principle and applications of Recombinant DNA- Bernard R. Glick, Jack J. Pasternak\n5.	Prescott and Dunn’s Industrial Microbiology – Reed G\n6.	Applied Biochemistry and Bioengineering – Wingard LB Jr, Katchalski-Katzir E and Goldster L\n7.	Comprehensive Biotechnology, Vol. I-IV – Moo-Young M");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3102");
                parent.setText2("Course Title:Basic Immunology\nI Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3104");
                parent.setText2("Course Title:Introductory Virology\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3106");
                parent.setText2("Course Title:Microbial Molecular Genetics\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3108");
                parent.setText2("Course Title:Food Microbiology\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3110");
                parent.setText2("Course Title:Enzymology Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==12){
                parent.setName("" + i);
                parent.setText1("Course Code:MBG 3112");
                parent.setText2("Course Title:Industrial Microbiology\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
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
            inflater = LayoutInflater.from(mbg31.this);
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



