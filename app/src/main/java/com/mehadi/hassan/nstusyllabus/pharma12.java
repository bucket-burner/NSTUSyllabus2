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


public class pharma12 extends  ExpandableListActivity
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
        for (int i = 1; i < 11; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1201");
                parent.setText2("Course Title:Pharmacognosy I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Recommended Books\n1.	Pharmacognosy- Varro E. Tyler, Lynn R. Brady and James E. Robbers.\n2.	Pharmacognosy- Treaseand Evans.\n3.	Pharmacognosy- Edward P. Claus, Varro E.Tyler, 5th edition, Lea and Febiger, Philadelphia. \n4.	Textbook of Pharmacognosy- T. E. Wallis.\n5.	Practical Pharmacognosy- RasheeduzZafar.\n6.	Natural Products, A Laboratory Guide - Raphael Ikan, Acadec Press, Inc., London.");

                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1202");
                parent.setText2("Course Title:Pharmacognosy I Lab\n Credit:1.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Recommended Books\n1.	Practical Pharmacognosy: Dr. K. R. Khandelwal\n2.	Practical Pharmacognosy: Joshi, Saroja\n3.	Practical Pharmacognosy: Rakesh Gupta");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1203");
                parent.setText2("Course Title:Inorganic Pharmacy II\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Introduction to Modern Inorganic Chemistry- S. Z. Haider..\n2.	Modern Inorganic Chemistry- R.D. Madan.\n3.	Introduction to Modern Inorganic Chemistry- J. D Lee.\n4.	Bentley and Driver’s Textbook of Pharmaceutical Chemistry- Bently, Arthur Owen, 8th edition, Oxford University Press.\n5.	Modern Inorganic Pharmaceutical Chemistry- Clarence A. Discher, Leonard C. Bailey, Thomas Medwick.\n6.	Rogers Inorganic Pharmaceutical Chemistry- Rogers, Charles Herbert, Taito O. Soine and Charles O. Wilson.\n7.	Inorganic Medicinal and Pharmaceutical Chemistry- Block, John H., Roche, Edward B.,    Soine, Taito O., Wilson, Charles O.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1204");
                parent.setText2("Course Title:Inorganic Pharmacy II\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Vogel’s Qualititative Inorganic Analysis: G.H. Jeffery, J. Bassett, J. Mendham and R.C. Denney, Longman Scientific and Technical, New York.\n2.	Practical Chemistry: O.P. Pandey, D.N. Bajpai, and S. Giri, , S. Chand and Co. Ltd, New Delhi.\n3.	Experimental Procedures in Elementary Qualitative Analysis: E.S. Gilreath, Mcgraw-Hill.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1205");
                parent.setText2("Course Title:Organic Pharmacy II\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Organic Chemistry - Robert Thornton Morrison and Robert Neilson Boyd.\n2.	A Textbook of Organic Chemistry – ArunBahl and B. S. Bahl.\n3.	Organic Chemistry, vo1. I and II- I. L. Finar.\n4.	Organic Chemistry - Louis Feiser and Mary Feiser.\n5.	Advanced Organic Chemistry – B. S. Bahl and ArubBahl.\n6.	Advanced Organic Chemistry- Reactions, mechanisms and structure, Jerry March.\n7.A Text Book of Organic Chemistry- Raj K. Bansal.\n8.	Chemistry of Organic Natural Products Vol I & II – O.P. Agarwal.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1207");
                parent.setText2("Course Title:Physical Pharmacy II\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Principles of Physical Chemistry:   M. M. Haque and M. A. Nawab.\n2.	Physical Pharmacy:  A. Martin and J. Swarbrick.\n3.	Physical Chemistry:   P.W. Atkins.\n4.	A Textbook of Physical Chemistry:  K.K. Sharma and L.K. Sharma.\n5.	Essentials of Physical Chemistry:  S. Bahl, D.G. Tuli and ArunBahl.\n6.	Physical Chemistry:   N. Kundu and S.K. Jain.\n7.	Principles of Physical Chemistry:  S. H. Maron and C.F. Prutton.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1208");
                parent.setText2("Course Title:Physical Pharmacy II\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Practical Physical Chemistry:  Palit, , Science Book Agency, Calcutta.\n2.	Practical Physical Chemistry:   Sharma, Vikas Publishing House Pvt. Ltd.\n3.	Advanced Practical Physical Chemistry: J.B. Yadav, Goel Publishing house, Meerut.\n4.	Text Book of Practical Chemistry: Khalique, A Ideal Library, Bangla Bazar, Dhaka.");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1209");
                parent.setText2("Course Title:Physiology I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Human Physiology : vol. I and II- ChandiCharanChatterjee.\n2.	A Text Book of Medical Physiology- Arther C. Guyton.\n3.	Review of Medical Physiology- W. F. Ganong.\n4.	A Text Book of Practical Physiology- C.L. Ghai.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1210");
                parent.setText2("Course Title:Physiology I Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Textbook of Practical Physiology:G.K. Pal\n2.	Practical Human Anatomy and Physiology: SR Kale, RR Kale");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1211");
                parent.setText2("Course Title:Viva Voce\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("An oral examination based on the syllabus of first year (Term I and II), will be taken after the semester final examination.");
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
            inflater = LayoutInflater.from(pharma12.this);
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


