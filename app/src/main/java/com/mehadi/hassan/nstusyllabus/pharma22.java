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


public class pharma22 extends  ExpandableListActivity
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
        for (int i = 1; i <9; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2201");
                parent.setText2("Course Title:Applied Microbiology\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
//                child.setText1("Coming Soon");
                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2203");
                parent.setText2("Course Title:Anatomy\nCredit:3.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Recommended Book:\n1.	Gray's Anatomy- Spalding Gray, International students edition, published by Churchill Livingstone");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2205");
                parent.setText2("Course Title:Pharmaceutical Technology I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Pharmaceutical Dosage Forms and Drug Delivery Systems- Howard C. Ansel, 6th edition, B. I. Waverly Pvt. Ltd., New Delhi. \n2.	Sprowl’s American Pharmacy- Lewis W. Dittert, 7th edition, J. B. Lippincott Company, Philadelphia.\n3.	Remington: The Science & Practice of Pharmacy- Alfronso R. Gennaro, 20th edition, Mack Publishing Company, Easton, Pennsylvania.\n4.	Bentley’s Textbook of Pharmaceutics- E. A. Rawlins, 8th edition, E.L.B.S., BailliereTindall.\n5.	Pharmaceutics: The Science of Dosage form Design- Michael Aulton, 1993, E.L.B.S., London");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2206");
                parent.setText2("Course Title:Pharmaceutical Technology I\nLab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming Soon");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2207");
                parent.setText2("Course Title:Pharmacology I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Pharmacology:   H. P. Rang, M. M. Dale and J. M. Ritte.\n2.	Goodman and Gilman’s The Pharmacological Basis of Therapeutics Vol. I & II:   A. Goodman Gilman, T. W. Rall, A. S. Nies and P. Taylor.\n3.	Pharmacology and Pharmacotherapeutics Vol. I & II:  R. S. Satoskar and S. D. Bhandarkar.\n4.	Essentials of Medical Pharmacology:  K. D. Tripathi.\n5.	Basic and Clinical Pharmacology:  B. G. Katzung.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2208");
                parent.setText2("Course Title:: Pharmacology I Lab\nCredit:3\1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2209");
                parent.setText2("Course Title:Biochemistry II\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Cell and Molecular Biology- E.D.P. De Robertis, 7th edition, Marcel and Dekker, NY.\n2.	Molecular Cell Biology, Hervey Lodish, Arnold Berk, S. Laurence Zipursky, 3rd edition, Lodish H. et al, 1995.\n3.	Biochemistry, 5th edition, J. M. Berg, J.L. Tymoczko and L. Stryer, Freeman, 1995.\n4.	Lehninger Principle of Biochemistry, David L. Nelson, Michael M. Cox, 4th edition, W.H. Freeman.\n5.	Amazing Schemes Within Your Genes- Balkwill, F. and Rolph, M., 1994, Harper  Collins.\n6.	Instant Notes in Biochemistry- Harries, Hooper and Houghton.\n7.	Molecular Biology of the Cell- Bruce Albertis, Dennis Bray, Julian Lewis, Martin Raff, Keith Robertis, James D. Watson, 3rd edition, Garland Publishing, NY.\n8.	Introduction to Bioinformatics- Teresa K. Attwood, David J. Parry-Smith, Paperback 1999, Prentice Hall");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 2213");
                parent.setText2("Course Title:Viva Voce\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("An oral examination based on the syllabus of second year (Term I and II), will be taken after the semester final examination.");
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
            inflater = LayoutInflater.from(pharma22.this);
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


