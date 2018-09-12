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


public class pharma11 extends  ExpandableListActivity
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
        for (int i = 1; i < 10; i++)
        {

            final Parent parent = new Parent();


            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1101");
                parent.setText2("Course Title:Introduction to\nPharmacy\nCredit:2.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("1.	Orientation: History of pharmacy, ancient ages, middle ages, modern ages, development of pharmacy in Bangladesh. Scope of pharmacy, ethics and professionalism, the practice of community pharmacy, pharmacist in industry, pharmacist in government.\n2.	Pharmacy education and profession: Brief introduction of the courses taught in a pharmacy program, pharmacy education in Bangladesh, pharmacy education in other countries.Differences between occupation and profession, pharmacy as a profession, definition and characteristics of pharmacy profession, social recognition and status of pharmacy profession, scopes and opportunities for pharmacists, career development in pharmacy; International and Bangladesh perspective.\n3.	Medical sociology: Social class and health, illness and behavior, ageing, the mythology role of medicine, ethnicity and health, the health professionals-patient relationship, outcomes of health care, the concept of rationing of health care.\n4.	Drugs and medicines: Sources of drugs, classification of drugs on the basis of actions, target organs and uses, difference between drug and medicine, nomenclatures of drugs.\n5. 	Drug standards: Pharmacopoeias and formularies (USP, BP, NF, BNF, BDNF etc.), monographs of drugs, drug regulation and control.\n6.	Pharmaceutical dosage form: Definition of different pharmaceutical dosage forms: Tablets, capsules, powders, solution, suspension, emulsion, ointment, cream, paste, jellies, suppositories, pharmaceutical aerosol and medical gases.\n7.	Information resources in the pharmaceutical sciences: Text books, reference books, e-books, merck index, encyclopaedias, journals, library catalogues, computer aided records, online resources, internet, website, pubmed, pubmed central, medline, medline plus, open access journals, HINARI, AGORA, medical records.\n8.WHO and essential drug concept.\nRecommended Books:\n1.	Pharmacy Practice: Social and behavioral aspects: A. I Wertheimer and M C Smith.\n2.	Bentley’s Text Book Of Pharmaceutics:   A. Owen Bentley, and E A Rawlins.\n3.	Pharmaceutical Practice:   D M Collett and M E Aulton.\n4.	Text Book Of Pharmaceutics:   E A Rawlins.\n5.	Comprehensive Pharmacy Review:   L. Shargel, Alan H Mutnick., Paul F Souney., and Larry N.Swanson\n6.	Introduction to Pharmacy, Dr. Md. Shah Amran, 1st edition, 2010, Krishnachura Prokashoni, Dhanmondhi, Dhaka, Bangladesh.");

                //Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1103");
                parent.setText2("Course Title:Inorganic Pharmacy I\nCredit:3.00  ");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("1.	Structure of atoms: An elementary treatment of theories of atomic structure, quantum numbers, Pauli’s exclusion principle, origin of spectral lines.\n2.	Chemical bonds: Electronic concept of valency, different types of chemical bond e.g. ionic, covalent, co-ordinate covalent, metallic, dipole, hydrogen bond etc., theories of covalent bonding and hybridization.\n3.	Classification of elements: The electronic structure of atoms, modern periodic table and periodic law, variation of properties within periods and groups, usefulness and limitations of periodic table.\n4.Chemistry of alkali and alkaline earth metals: General characteristics of alkali and alkaline earth metals, chemistry of group IA and II elements and their compounds, comparison of alkaline earth metals with alkali metals, pharmaceutical applications of alkali and alkaline earth metals.\n5.	Chemistry of co-ordination compounds: Ligands or co-ordinating groups, monodentate ligands or unidentate ligands, polydentate ligands, co-ordination number, co-ordination sphere, tendency of polydentate ligands to form chelates, application of chelate formation, nomenclature of co-ordination compounds, isomerism of co-ordination compounds, Warners co-ordination theory, Sidgwick’selectronic concept of co-ordinate bond in co-ordination compounds.\n6.	Inert or noble gases: Source, electronic configuration and inertness, isolation of inert gases from dry air (chemical method) and liquid air (physical method), physical and chemical properties and uses of noble gases, conditions and types of compounds formed by inert gases.\nRecommended Books:\n1.1.	Introduction to Modern Inorganic Chemistry- S. Z. Haider\n2.2.	Modern Inorganic Chemistry- R.D. Madan\n3.3.	Introduction to Modern Inorganic Chemistry- J. D Lee\n4.4.	Bentley and Driver’s Textbook of Pharmaceutical Chemistry- Bently, Arthur Owen\n5.5.	Modern Inorganic Pharmaceutical Chemistry- Clarence A. Discher, Leonard C. Bailey, Thomas Medwick\n6.6.	Rogers Inorganic Pharmaceutical Chemistry- Rogers, Charles Herbert, Taito O. Soine and Charles O. Wilson\n7.7.	Inorganic Medicinal and Pharmaceutical Chemistry- Block, John H., Roche, Edward B., Soine, Taito O., Wilson, Charles O., 1974, Lea and Febiger, Philadelphia.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1104");
                parent.setText2("Course Title:Inorganic Pharmacy\nI Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.1.	Vogel’s Qualititative Inorganic Analysis: G.H. Jeffery, J. Bassett, J. Mendham and R.C. Denney, Longman Scientific and Technical, New York.\n2.2.	Practical Chemistry: O.P. Pandey, D.N. Bajpai, and S. Giri, , S. Chand and Co. Ltd, New Delhi.\n3.3.	Experimental Procedures in Elementary Qualitative Analysis: E.S. Gilreath, Mcgraw-Hill.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1105");
                parent.setText2("Course Title:Organic Pharmacy I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Organic Chemistry- Robert Thornton Morrison and Robert Neilson Boyd\n2.	A Textbook of Organic Chemistry- ArunBahl and B. S. Bahl\n3.	Organic Chemistry, vo1. I and II- I. L. Finar\n4.	Organic Chemistry- Louis Feiser and Mary Feiser\n5.	Advanced Organic Chemistry- B. S. Bahl and ArubBahl\n6.	Introduction to Organic Laboratory Techniques- Donald L. Pavia, Gary M. Lampman, George S. Kriz, Randall G. Engel\n7.	Advanced Organic Chemistry- Reactions, Mechanisms and Structure, Jerry March\n8.	A Text Book of Organic Chemistry- Raj K. Bansal");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1106");
                parent.setText2("Course Title:Organic Pharmacy\nI Lab\nCredit:1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Experimental Organic Chemistry:  H.D. Durst and G.W. Gokel, McGraw-Hill Book Company, New York, 1987.\n2.	Vogel’s Text Book of Practical Organic Chemistry, ELBS with Longman, 5th Edition.\n3.	Organic Experiment:  L.F. Fiesser, K.L. Williamson, D.C. Health and Company Lexington, Massachusetts, Toronto, 4th Edition.\n4.	Systematic Identification of Organic Compounds:  R.L. Shriner, R.C. Fuson and D.Y. Curtin, John Wiley Sons, Inc. New York, London, Sydney.\n5.	Elementary Practical Organic Chemistry (Part 1):  A.I. Vogel, Longman.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1107");
                parent.setText2("Course Title:Physical Pharmacy I\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Principles of Physical Chemistry:   M. M. Haque and M. A. Nawab.\n2.	Physical Pharmacy:  A. Martin and J. Swarbrick.\n3.	Physical Chemistry:   P.W. Atkins.\n4.	A Textbook of Physical Chemistry:  K.K. Sharma and L.K. Sharma.\n5.	Essentials of Physical Chemistry:  S. Bahl, D.G. Tuli and ArunBahl.\n6.	Physical Chemistry:   N. Kundu and S.K. Jain.\n7.	Principles of Physical Chemistry:  S. H. Maron and C.F. Prutton.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1108");
                parent.setText2("Course Title:Physical Pharmacy I\nLab\nCredit:`1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books:\n1.	Experimental Organic Chemistry:  H.D. Durst and G.W. Gokel, McGraw-Hill Book Company, New York, 1987.\n2.	Vogel’s Text Book of Practical Organic Chemistry, ELBS with Longman, 5th Edition.\n3.	Organic Experiment:  L.F. Fiesser, K.L. Williamson, D.C. Health and Company Lexington, Massachusetts, Toronto, 4th Edition.\n4.	Systematic Identification of Organic Compounds:  R.L. Shriner, R.C. Fuson and D.Y. Curtin, John Wiley Sons, Inc. New York, London, Sydney.\n5.	Elementary Practical Organic Chemistry (Part 1):  A.I. Vogel, Longman.");
                parent.getChildren().add(child3);
            }


            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1109");
                parent.setText2("Course Title:Basic Mathematics\nAnd Biostatistics\nCredit:3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Recommended Books\n1.	Matrices- Ayres, Schaum’s Outline Series.\n2.	Methods in Biostatistics for Medical Students and Research Workers:  B. K. Mahajan\n3.	Methods of Statistics- M. G. Mostafa.\n4.	Statistical Methods in Medical Research- P. Armitage.\n5.	An Introduction to Statistics and Probability:   M. Nurul Islam.\n6.	Primer of Biostatistics: Stanton A. Glantz.\n7.	Medical and Pharmaceutical Statistics: JMA Hannan.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code:PHAR 1111");
                parent.setText2("Course Title:Computer Fundamentals\nCredit:2.00");
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
            inflater = LayoutInflater.from(pharma11.this);
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


