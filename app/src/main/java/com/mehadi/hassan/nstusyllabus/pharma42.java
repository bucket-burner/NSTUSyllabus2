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


public class pharma42 extends  ExpandableListActivity
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
        for (int i = 1; i <10; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4201");
                parent.setText2("Course Title:Biopharmaceutics and\nPharmacokinetics III\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Recommended Books:\n1.	Applied Biopharmaceutics and Pharmacokinetics - Shargel and Andrew B.C. Yu.\n2.	Biopharmaceutics and Clinical Pharmacokinetics - Milo Gibaldi. 	\n3.	Biopharmaceutics and Drug action - Donald E. Cadwallader.\n4.	Pharmacokinetics for the Non-mathematical - Bourne, Triggs and Eadie.\n5.	Textbook of Physical Pharmaceutics -  CVSSubrahmanyam.");
                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4203");
                parent.setText2("Course Title:Pharmaceutical\nBiotechnology III\nCredit:3.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Recommended Books:\n1.	Pharmaceutical Biotechnology- Daan J.A. Crommelin.\n2.	Pharmaceutical Biotechnology- S.P. Vyas and V.K. Dixit.\n3.	Pharmaceutical Biotechnology- K. Sambamurthy and A. Kar.\n4.	Biochemistry and Molecular Biology - W.H. Elliott and Daphne C. Elliott.\n5.	Pharmaceutical Biotechnology - Michael J. Groves.\n6.	Handbook of pharmaceutical biotechnology - Shayne Cox Gad.\n7.	Biotechnology Theory and Techniques - Lirikjian Su.\n8.	Proteins Structure and Function - David Whitford.\n9.	Pharmaceutical Biotechnoligy: SS Purohit, NH Kakrani and AK Saluja. \n10.	Biotechnology and Genomics: PK Gupta. ");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4205");
                parent.setText2("Course Title:Clinical Pathology\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Robbins and Cotran Pathologic Basis of Disease - Kumar, Abbas and Fausto.\n2.	Pathology and Therapeutics for Pharmacists - Russell J Greene, Norman D Harris.\n3.	Color Atlas of Pathology - Ursus-NikolausRiede, Martin Werner.\n4.	Practical Pathology and Microbiology - Prof. K. A. Khaleque, Dr. K. Z. Mamun.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4207");
                parent.setText2("Course Title:Cosmetology\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Chemistry and Technology of the Cosmetics and Toileteries Industry - D. F.   Williams and W. H. Schmitt, Hardcover 1992, Kluwer Academic Publications.\n2.	Harry's Cosmeticology - J. B. Wilkinson & R. J. Moore, 7th edition, Longman Scientific & Technical.\n3.	Modern Cosmetics: Perfumes, Cosmetics and Soaps, Vol. I, II and III - W. A. Poucher, 8th edition, Chapman & Hall, London.\n4.	Cosmetics Science and Technology (Vol. 1&2) - M.S.Balsam&E.Sagarin.\n5.	Preparation and Distribution of Drugs and Cosmetics - S.N. Sahu.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4208");
                parent.setText2("Course Title:Cosmetology Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon ");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4209");
                parent.setText2("Course Title:Functional Foods,\nNutraceuticals and Herbal Medicine\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Handbook of Nutraceuticals and Functional Foods: Robert E.C Wildman\n2.	Functional Foods: Designer Foods, Pharmafoods, Nutraceuticals: Israel Goldberg\n3.	Advances in Natural Medicines, Nutraceuticals and Neurocognition: Con Kerry Kenneth Stough, Andrew Scholey\n4.	Handbook of Nutraceuticals and Functional Foods: Robert E. C. Wildman");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4210");
                parent.setText2("Course Title:Industrial Training\nand Report\nCredit:2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("At the end of the third year, the students will undergo in-plant training program for 4 to 6 weeks in any pharmaceutical industries. After completion of the training program successfully the students will have to submit a report to the department.");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4211");
                parent.setText2("Course Title:Clinical Pharmacy\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	A Textbook of Hospital and Clinical Pharmacy:PratibhaNand and R.K. Khar	\n2.	Hospital and Clinical Pharmacy:Anees Ahmed Siddiqul and M. Ali\n3.	Clinical Biochemistry: J. Marshal and K. Bangert\n4.	Remington, The Science and Practice of Pharmacy: A. R. Gennaro\n5.	Forensic Pharmacy and Ethics:  S.C. Sahajan and J. B. K. Narang\n6.	Applied Therapeutics: Lloyd Y. Young and M.A. Koda\n7.	Textbook of Forensic Pharmacy: B. M. Mithal	");
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 4213");
                parent.setText2("Course Title:Viva Voce\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("An oral examination based on the syllabus of first year (Term I and II), will be taken after the semester final examination");
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
            inflater = LayoutInflater.from(pharma42.this);
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


