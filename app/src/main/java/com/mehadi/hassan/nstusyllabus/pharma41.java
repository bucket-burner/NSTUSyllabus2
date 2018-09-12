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


public class pharma41 extends  ExpandableListActivity
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
        for (int i = 1; i <12; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4101");
                parent.setText2("Course Title:Pharmaceutical Technology\nIV\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Recommended Books: \n1.	The Theory and Practice of Industrial Pharmacy - Leon Lachman, Herbert A. Liberman, Joseph L. Kanig, 3rd edition, Varghese Publishing House Inc.\n2.	Sprowl’s American Pharmacy - Lewis W. Dittert, 7th edition, J. B. Lippincott Company, Philadelphia.\n3.	Pharmaceutics: The Science of Dosage form Design - Michael Aulton, 1993, E.L.B.S., London.\n4.	Remington’s The Science & Practice of Pharmacy - Alfronso R. Gennaro, 20th edition, Mack Publishing Company, Easton, Pennsylvania.\n5.	Modern Pharmaceutics - Gilbert S. Banker and Christopher T. Rhodes, Drug & Pharmaceutical Science.\n6.	Novel Drug Delivery Systems – Yie W. Chien, 2nd edition, Marcel Dekker, Inc. \n7.	Pharmaceutical Dosage Forms and Drug Delivery Systems - Howard C. Ansel, 6th edition, B. I. Waverly Pvt. Ltd., New Delhi.");
                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4103");
                parent.setText2("Course Title:Pharmacology IV\nCredit:3.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Recommended Books: \n1.	Goodman & Gillman’s Pharmacological Basis of Therapeutics - Hardman, Joel G., 10th edition, Mcgraw-Hill Incorporated.\n2.	Basic and Clinical Pharmacology - Bertram G. Katzung, 9th edition, McGraw Hill Companies.\n3.	Clinical Pharmacology - D. R. Laurence, P. N. Bennett and M. J. Brown, 9th edition, Churchill Livingstone.\n4.	Clinical Pharmacy and Therapeutics - Roger walker and Clive Edwards, 3rd edition, Churchill Livingstone.\n5.	Essentials of Medical Pharmacology: K. D. Tripathi.\n6.	Pharmacology - H. P. Rang, M. M. Dale and J. M. Ritter.\n7.	Lipponcott’s Illustrated Reviews Pharmacology - R. A. Harvey and P. C. Champe. \n8.	Principles of Drug Action, The Basis of Pharmacology - A. Goldstein and L. Aronow. ");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4104");
                parent.setText2("Course Title:Pharmacology III Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon ");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4105");
                parent.setText2("Course Title:: Biopharmaceutics and\nPharmacokinetics II\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Biopharmaceutics& Clinical Pharmacokinetics- Milo Gibaldi, 4th edition, Le &Febiger, Philadelphia.\n2.	Applied Biopharmaceutics and Pharmacokinetics - Leon Shargel and Andrew B.C.\n3.	Biopharmaceutics& Clinical Pharmacokinetics- Notari, R. E., 4th editions, Marcel Dekker Inc.\n4.	Biopharmaceutics& Relevant Pharmacokinetics- T. G. Wagner and M. Pernarowski, 5th edition, Hamilton Drug Intelligence Publication.\n5.	Biopharmaceutics& Drug Interactions- Donald E. Cadwallader, 3rd editions,   Raven Press, Newyork. \n6.	Pharmacokinetics- M. Gibaldi& D. Perrier.\n7.	Textbook of Physical Pharmaceutics: CVS Subrahmanyam.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4106");
                parent.setText2("Course Title:Biopharmaceutics and\nPharmacokinetics II Lab \nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon ");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4107");
                parent.setText2("Course Title::Immunology\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Cellular and Molecular Immunology: Abul K. Abbas, A.H. Lichtman and J.S. Pober\n2.	Immunology: Ivan Roitt, J. Brostoff and David Male");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4109");
                parent.setText2("Course Title:Pharmaceutical Marketing\nand Management\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Basic Principles of Marketing - Jeorge R. Terry.\n2.	Pharmaceutical Marketing - Smith.\n3.	Marketing Management - Philips Kottler, 10th edition, Printice Hall of India Pvt. Ltd.\n4.	Marketing Strategy: A Global Perspective - Vernon R. Stauble, The Dryden Press.\n5.	Principles and Methods of Pharmacy Management - H. A. Smith.\n6.	Pharmaceutical Industrial Management - R. M. Mehta.\n7.	Personnel management and Industrial Relations - R. S. Davar.\n8.	Personnel management - Mamoria.\n9.	Purchasing and Store Keeping - D. R. Gupta, R. K. Rajput.\n10.	Materials management - Gopalkrisnan,and R. K. Rajput.\n11.	Quantitative Techniques for Managerial Decision Making - U.K. Srivastava and S. C. Sharma.");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4111");
                parent.setText2("Course Title:Molecular Biology II\nCredit:2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Cellular and Molecular Immunology - Abul K Abbas, Andrew H Lichtman, Jordan S Pober\n2.	Immunology - Ivan Roitt, Jonathan Brostoff , David Male\n3.	Molecular Biology - PC Turner, AG Mclennam, AD Bates\n4.	Molecular Biology of Cells - Alberst\n5.	The Cell: A Molecular Approach - Alberts B. et al.\n6.	Applied therapeutics - Young kodekihble et.al.\n7.	Hand book of Drug Interaction -  Karalliedde&Hanry\n8.	Molecular Cell Biology - Lodish et al");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4112");
                parent.setText2("Course Title:Molecular Biology Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4113");
                parent.setText2("Course Title:Quality Control and\nAnalytical Method Validation\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Assurance of Quality Pharmaceuticals: M. Shah Nawaz  Khan 	\n2.	Quality control of herbal drugs:Pulok K. Mukherjee");
                parent.getChildren().add(child3);
            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4114");
                parent.setText2("Course Title:Quality Control and\nAnalytical Method Validation Lab\nCredit:1.00");
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
            inflater = LayoutInflater.from(pharma41.this);
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
