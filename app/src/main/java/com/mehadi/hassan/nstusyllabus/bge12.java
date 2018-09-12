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


public class bge12 extends  ExpandableListActivity
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
        for (int i = 1; i < 10; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1201");
                parent.setText2("Course Title: Molecular Biology-01\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References\n" +
                                "\n" +
                                "1. Alberts B, Bray D and Lewis J. Molecular Biology of the Cell. 1989. Garland Publishing Inc. New York, USA\n" +
                                "\n" +
                                "2. Nelson DL and Cox MM. Lehninger, Principles of Biochemistry. 4th Edition. 2008. W. H. Freeman and Company. New York, USA\n" +
                                "\n" +
                                "3. Berg JM, TymoczkoJL and Stryer L. Biochemistry. 5th Edition. 2008. W.H. Freeman and Com. NY, USA.\n" +
                                "\n" +
                                "4. Brock TD and Madigan MT. Biology of Micro organisms. 1997. Prentice hall International.\n" +
                                "\n" +
                                "5. Darnell J, Lodish H and Baltimore D. Molecular Cell Biology. 1986. W. H. Freeman and Com. NY, USA.\n" +
                                "\n" +
                                "6. Gunthes S.  Stent Richard Calendar Molecular Genetics An Introductory Narrative. 2nd Edition. \n" +
                                "\n" +
                                "7. Atlas RM. Principles of Microbiology. 2nd Edition. 1997. W.C. Brown Publishers.\n" +
                                "\n" +
                                "8. Pelezer & Reid. Microbiology.\n" +
                                "\n" +
                                "9. Readings from Scientific American. Molecules of life. W.H. Freeman and Company. New York, USA\n" +
                                "\n" +
                                "10. Stryer L. Molecular Design of Life. 1989. W.H. Freeman and Company. New York, USA\n" +
                        "\n" +
                                "11. Tortora, Funke and Case. Microbiology An Introduction. 1997. Addison Wesley Longman Inc.  \n" +
                                "\n" +
                                "12. Voet D, Voet JG. Biochemistry. 4th edition. 2010. John Wiley & Sons \n" +
                                "\n" +
                                "13. Watson JD, Baker TA, Bell SP, Gann A, Levine M, Losick R. Molecular Biology of the Gene. 6th Edition. 2007. CSHL Press & Benjamin Cummings, San Francisco, CA.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1203");
                parent.setText2("Course Title: Fundamental of\nBiochemistry\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References\n" +
                        "\n" +
                        "1.	Albanese AA. Principles of Biochemistry. 1980. Worth Pub. Philadelphia, USA\n" +
                        "\n" +
                        "2.	Bahl & Bahl. Advanced Organic Chemistry. 1984.\n" +
                        "\n" +
                        "3.	Biochemistry- V. K Jain.\n" +
                        "\n" +
                        "4.	Berg JM, TymoczkoJL and Stryer L. Biochcmistry. 5th Edition. 2008. W.H. Freeman and Company. New York, USA\n" +
                        "\n" +
                        "5.	U. Satyanarayana, U. Chakrapani. Biochemistry.Fourth edition, (2013)\n" +
                        "\n" +
                        "6.	Clark WH. Experimental Biochemistry. 1977. Freeman and Company.\n" +
                        "\n" +
                        "7.	Conn EE and Stampt PK. Outlines of Biochemistry. 1984. John Wiley and Sons. New York, USA\n" +
                        "\n" +
                        "8.	Dev AC. Fundamentals of Biochemistry. 1996.\n" +
                        "\n" +
                        "9.	Lehninger and Albert L. Principles of Biochemistry. 1978. M/S Worth Publishers Inc, New York.\n" +
                        "\n" +
                        "10.	Mathews & Van Holde. Biochemistry. 2nd Edition. Cummings Pub. Co. Benjamin,\n" +
                        "\n" +
                        "11.	Merts and Parter. Laboratory Experiments in Biochemistry. Burgens Pub. Co. Minneapolis.\n" +
                        "\n" +
                        "12.	Nelson DL and Cox MM. Lehninger Principles of Biochemistry. 4th Edition. 2008. W. H. Freeman and Company. New York, USA\n" +
                        "\n" +
                        "13.	Rawn. Biochemistry. 1989.\n" +
                        "\n" +
                        "14.	Selim Reza. Medical Biochemistry. 2007.\n" +
                        "\n" +
                        "15.	Street. Plant Metabolism. 1967. Pergam Press. London, UK\n" +
                        "\n" +
                        "16.	Voet D, Voet JG. Biochemistry. 4th edition. 2010. John Wiley & Sons\n" +
                        "\n" +
                        "17.	West ES, Todd WR, Manson HS. Text Book of Biochemistry. New Delhi, Oxford & IBH Pub. Co. Pvt. Ltd.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1204");
                parent.setText2("Course Title: Fundamental of\nBiochemistry Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Albanese AA. Principles of Biochemistry. 1980. Worth Pub. Philadelphia, USA\n" +
                        "\n" +
                        "2.	Bahl & Bahl. Advanced Organic Chemistry. 1984.\n" +
                        "\n" +
                        "3.	Biochemistry- V. K Jain.\n" +
                        "\n" +
                        "4.	Berg JM, TymoczkoJL and Stryer L. Biochcmistry. 5th Edition. 2008. W.H. Freeman and Company. New York, USA\n" +
                        "\n" +
                        "5.	U. Satyanarayana, U. Chakrapani. Biochemistry.Fourth edition, (2013)\n" +
                        "\n" +
                        "6.	Clark WH. Experimental Biochemistry. 1977. Freeman and Company.\n" +
                        "\n" +
                        "7.	Conn EE and Stampt PK. Outlines of Biochemistry. 1984. John Wiley and Sons. New York, USA\n" +
                        "\n" +
                        "8.	Dev AC. Fundamentals of Biochemistry. 1996.\n" +
                        "\n" +
                        "9.	Lehninger and Albert L. Principles of Biochemistry. 1978. M/S Worth Publishers Inc, New York.\n" +
                        "\n" +
                        "10.	Mathews & Van Holde. Biochemistry. 2nd Edition. Cummings Pub. Co. Benjamin,\n" +
                        "\n" +
                        "11.	Merts and Parter. Laboratory Experiments in Biochemistry. Burgens Pub. Co. Minneapolis.\n" +
                        "\n" +
                        "12.	Nelson DL and Cox MM. Lehninger Principles of Biochemistry. 4th Edition. 2008. W. H. Freeman and Company. New York, USA\n" +
                        "\n" +
                        "13.	Rawn. Biochemistry. 1989.\n" +
                        "\n" +
                        "14.	Selim Reza. Medical Biochemistry. 2007.\n" +
                        "\n" +
                        "15.	Street. Plant Metabolism. 1967. Pergam Press. London, UK\n" +
                        "\n" +
                        "16.	Voet D, Voet JG. Biochemistry. 4th edition. 2010. John Wiley & Sons\n" +
                        "\n" +
                        "17.	West ES, Todd WR, Manson HS. Text Book of Biochemistry. New Delhi, Oxford & IBH Pub. Co. Pvt. Ltd.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1205");
                parent.setText2("Course Title: Fundamental of Biology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Agrawal KC. Biodiversity. 1998. Agro Botanica.\n" +
                        "2.	Albert  Hill F, Sharma OP. Economic Botany. 1996.TataMcGraw Hill Pub. Com. Limited.\n" +
                        "3.	Albert Hill F. Economic Botany. 1989. Tata Mc.Graw Hill, Pub. Com. Ltd.\n" +
                        "4.	Alexopoulas CJ, Mims CW, Blackwell M. Introductory Mycology. 1996. John Wily & Sons.\n" +
                        "5.	Attenborough D. Life on  Earth. 1979.\n" +
                        "6.	Datta SC. Systematic Botany. 1988. Wiley Eastern limited.\n" +
                        "7.	Dube HC. A Textbook of fungi, Bacteria and Viruses. 1978. Vikas Pub. House. Pvt. Ltd. India\n" +
                        "8.	Esau. Plant Anatomy.1980. Wily Eastern Ltd.\n" +
                        "9.	Lawrence E and Thomas MG. Population Genetics and Evolution.\n" +
                        "10. Lawrence GHM. Taxonomy of Vascular Plants. Concepts in Biology.\n" +
                        "11. Mackenzie A, Ball AS and Virdee SR. Instant notes in Ecology. 1998. Viva books Pvt Ltd.\n" +
                        "12. Maheshwari P. An Introduction to the Embryology of Angiosperms. 1950. McGraw. Hill.\n" +
                        "13. Pandey BP. Plant Anatomy. 1998. S. Chand & Com Ltd. India\n" +
                        "14. Raven PH and Johnson GB. Biology. 1986. Times Mirror/Mopsby College Pub. Ltd. St. Louis USA.\n" +
                        "15. Kotpal RL. Modern Textbook of Zoology (Invertebrates). 10th Ed. 2009. Rastogi Publications, India\n" +
                        "16. Shukla RS and Chandel PS. Plant Ecology. 1998. S. Chand & Com Ltd. India\n" +
                        "17. Kotpal RL. Modern Textbook of Zoology (Vertebrates). 10th Ed. 2009. Rastogi Publications, India\n" +
                        "18. Ganguly BB, Sinha AK and Adhikari S. Biology of AnimalsVolume 1 & 2. 1987. New Central Book Agency 8/1 Chintumoni Das Lane: Calcutta 700009  India.\n" +
                        "19. Richards OW and Davies RG. Volume 1: General Text Book of Entomology. 1993. BI Publications Pvt. ltd. New Delhi.\n" +
                        "20. Richards OW and Davies RG. Volume 2: General Text Book of Entomology. 1993. BI Publications Pvt. Ltd.  New Delhi.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1206");
                parent.setText2("Course Title: Fundamental of\nBiology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Fundamental of Biology\"");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1207");
                parent.setText2("Course Title: Human Physiology I\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Gyton, M.D: Text book of Medical  Physiology\n" +
                        "\n" +
                        "2.	Chattrerjee, C.C: Human Physiology, Vol. I and II\n" +
                        "\n" +
                        "3.	William, F. Ganong, 2006: Review of Medical Physiology\n" +
                        "\n" +
                        "4.	Elaine, N: Human Anatomy and Physiology (4th edition)\n" +
                        "\n" +
                        "5.	Shana and Ghosh: Human Physiology\n" +
                        "\n" +
                        "6.	P & K Sembulingam- Essential of Medical Physiology.\n" +
                        "\n" +
                        "7.	Guyton and Hall- Text book of Medical Physiology.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1209");
                parent.setText2("Course Title: Basic Mathematics\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Schaums Series\n" +
                        "\n" +
                        "2.	Raina Robeva et al: An Invitation to Biomathematics.");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1211");
                parent.setText2("Course Title: English\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "1. S.M. Zakir Hossain. A Passage to the English Language, 3rd impression, December 2001. Rohel Publication, Dhaka.\n" +
                        "\n" +
                        "2. Moniruzzaman. Basic English Language Skills, 2002, Friends Book Corner.\n" +
                        "\n" +
                        "3. S.M. Amanullah. A Guide to Correct Speech. 2007, Albatross Publication.\n" +
                        "\n" +
                        "4. C.R. Kothari. Research Methodology, 2005, New Age International (r) Limited Publishers.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1213");
                parent.setText2("Course Title: Course viva\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Viva-voce on all courses belonging to the first year.");
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
            inflater = LayoutInflater.from(bge12.this);
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

