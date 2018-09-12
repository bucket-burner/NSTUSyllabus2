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


public class bge11 extends  ExpandableListActivity
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
        for (int i = 1; i < 11; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1101");
                parent.setText2("Course Title: Introductory Biotechnology\nand Genetic Engineering\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References\n" +
                        "\n" +
                        "1. Bilgrami and Pandey. Introduction to Biotechnology, CBS Publishers, India. (1990).\n" +
                        "\n" +
                        "2. Dubey, R.C. Introduction to Biotechnology. 7th ed. S. Chand & Co. Pvt. Ltd. India. (1995).\n" +
                        "\n" +
                        "3. Bullock, J. and Uritiansen, B. Basic Biotechnology. Academic Press, UK. (1995).\n" +
                        "\n" +
                        "4. Watson, J.D., Tooze, J. and Kurtz, D.T. Recombinant DNA: A short Course, Scientific American Books, New York. 1983.\n" +
                        "\n" +
                        "5. B.D. Singh Biotechnology. Second Edition. (2008).\n" +
                        "\n" +
                        "6. Smith, J.E. Biotechnology, 2nd Ed, Edward Arnold PubNY, UK. (1988).\n" +
                        "\n" +
                        "7. U. Satyanarayana, U. Chakrapani. Biochemistry.Fourth edition, (2013).\n" +
                        "\n" +
                        "8. Rao, N.S.S. Biofertilizer in Agriculture and Forestry, Oxford and IBH Pvt. Ltd. India (1996).\n" +
                        "\n" +
                        "9. Chopra VL and Nasim A. Genetic Engineering and Biotechnology Concepts, Methods and Applications. Oxford & IBH P.C.P, New Delhi. (1990).");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1103");
                parent.setText2("Course Title: Fundamentals of Genetics\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References\n" +
                        "\n" +
                        "1. Lewing B. Genes Viii. Sixth Edi.  2003. Oxford University Press\n" +
                        "\n" +
                        "2.	B. D. Singh: Fundamentals of Genetics. Kalyani Pub, New Delhi\n" +
                        "\n" +
                        "3.	Klung WS and Cummings MR. Concepts of Genetics. Scott, Foresman and Company USA (1980).\n" +
                        "\n" +
                        "4.	Avers CJ. Genetics. 1980. D. Van Nostrand Company, New York.\n" +
                        "\n" +
                        "5.	Sambamurty AVSS. Handbook of Genetics. 2nd Edition. Narosa Publishing House, New Delhi.\n" +
                        "\n" +
                        "6.	Snustad DP, Simmons MJ and Jenkins JB.. Principles of Genetics. 1997. Jacaranda/Wiely publishers.\n" +
                        "\n" +
                        "7.	Strickberger MW. Genetics. 1995. Prentice-Hall of India Private Ltd. New Delhi-110001.\n" +
                        "\n" +
                        "8.	Verma PS and Agarwal VK. Cell Biology, Genetics, Molecular Biology and Evolution. 1974. S. Chand & Company Ltd. Ram Nagar, New Delhi- 110055\n" +
                        "\n" +
                        "9.	Verma PS and Agarwal VK. Genetics. 1975. S. Chard and Company Ltd, Ram Nagar, New Delhi- 110055\n" +
                        "\n" +
                        "10.	Watson JD, Baker TA, Bell SP, Gann A, Levine M, Losick R. Molecular Biology of the Gene, 6th Edition. 2007. CSHL Press & Benjamin Cummings, San Francisco, CA.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1105");
                parent.setText2("Course Title: Cell Biology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. Alberts B, et. al., Essential Cell Biology. 2nd edition. 2004.\n" +
                        "\n" +
                        "2.	Alberts B, Johnson A, Lewis J, Raff M, Roberts K, Walter P. Molecular Biology of the Cell. 5th Edi. 2007. Garland Publishing. Inc. New York.\n" +
                        "\n" +
                        "3.	Arora M. Molecular Biology.\n" +
                        "\n" +
                        "4.	Bhamrah HS. Molecular Cell Biology.\n" +
                        "\n" +
                        "5.	De Robertis EDP. Cell and Molecular Biology. 8th edition. 2008.  Lippincott Williams And Williams.\n" +
                        "\n" +
                        "6.	Gerald Karp. Cell and Molecular Biology Concepts and Experiments.\n" +
                        "\n" +
                        "7.	Hall JL, Flowers TJ and Roberts RM. Plant Cell Structure and Metabolism\n" +
                        "\n" +
                        "8.	Nelson DL, Cox MM. Lehninger. Principles of Biochemistry. 5th Edi. 2008. WH Freeman and company, New York\n" +
                        "\n" +
                        "9.	Power CB. Cell Biology. 1997. Himalaya Publishing House, Bombay-400004.\n" +
                        "\n" +
                        "10.	Sadova DE.. Cell Biology Organelle Structure & Function. Jones & Bartlet Publication. Boston, USA\n" +
                        "\n" +
                        "11.	Sominath MS. Cell Biology.\n" +
                        "\n" +
                        "12.	Verma PS and Agarwal VK. Cell Biology, Genetics, Molecular Biology and Evolution. 1974. S. Chand & Company Ltd. Ram Nagar, New Delhi- 110055.\n" +
                        "\n" +
                        "13.	Verma PS and Agarwal VK. Cytology.\n" +
                        "\n" +
                        "14.	Verma PS. Cell Biology.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1106");
                parent.setText2("Course Title: Cell Biology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. Alberts B, et. al., Essential Cell Biology. 2nd edition. 2004.\n" +
                        "\n" +
                        "2.	Alberts B, Johnson A, Lewis J, Raff M, Roberts K, Walter P. Molecular Biology of the Cell. 5th Edi. 2007. Garland Publishing. Inc. New York.\n" +
                        "\n" +
                        "3.	Arora M. Molecular Biology.\n" +
                        "\n" +
                        "4.	Bhamrah HS. Molecular Cell Biology.\n" +
                        "\n" +
                        "5.	De Robertis EDP. Cell and Molecular Biology. 8th edition. 2008.  Lippincott Williams And Williams.\n" +
                        "\n" +
                        "6.	Gerald Karp. Cell and Molecular Biology Concepts and Experiments.\n" +
                        "\n" +
                        "7.	Hall JL, Flowers TJ and Roberts RM. Plant Cell Structure and Metabolism\n" +
                        "\n" +
                        "8.	Nelson DL, Cox MM. Lehninger. Principles of Biochemistry. 5th Edi. 2008. WH Freeman and company, New York\n" +
                        "\n" +
                        "9.	Power CB. Cell Biology. 1997. Himalaya Publishing House, Bombay-400004.\n" +
                        "\n" +
                        "10.	Sadova DE.. Cell Biology Organelle Structure & Function. Jones & Bartlet Publication. Boston, USA\n" +
                        "\n" +
                        "11.	Sominath MS. Cell Biology.\n" +
                        "\n" +
                        "12.	Verma PS and Agarwal VK. Cell Biology, Genetics, Molecular Biology and Evolution. 1974. S. Chand & Company Ltd. Ram Nagar, New Delhi- 110055.\n" +
                        "\n" +
                        "13.	Verma PS and Agarwal VK. Cytology.\n" +
                        "\n" +
                        "14.	Verma PS. Cell Biology.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1107");
                parent.setText2("Course Title: Microbiology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Brock TD. Biology of Microorganisms.\n" +
                        "\n" +
                        "2.	Pelzer MJ and Kreig CNR. Microbiology.\n" +
                        "\n" +
                        "3.	Schlegel G. General Microbiology.\n" +
                        "\n" +
                        "4.	Tortora, Fanke and Case. Microbiology An Introduction.\n" +
                        "\n" +
                        "5.	Dube HC. A Bacteria and Viruses, textbook of Fungi.\n" +
                        "\n" +
                        "6.	Snustad DP, Sinnons MJ and Jenkns JB. Principles of Genetics. 1997. Wiely Publishers Jacaranda\n" +
                        "\n" +
                        "7.	Chakraborty P. A Text book of Microbiology.\n" +
                        "\n" +
                        "8. Agarwal AK. Industrial Microbiology");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1108");
                parent.setText2("Course Title: Microbiology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1.	Brock TD. Biology of Microorganisms.\n" +
                        "\n" +
                        "2.	Pelzer MJ and Kreig CNR. Microbiology.\n" +
                        "\n" +
                        "3.	Schlegel G. General Microbiology.\n" +
                        "\n" +
                        "4.	Tortora, Fanke and Case. Microbiology An Introduction.\n" +
                        "\n" +
                        "5.	Dube HC. A Bacteria and Viruses, textbook of Fungi.\n" +
                        "\n" +
                        "6.	Snustad DP, Sinnons MJ and Jenkns JB. Principles of Genetics. 1997. Wiely Publishers Jacaranda\n" +
                        "\n" +
                        "7.	Chakraborty P. A Text book of Microbiology.\n" +
                        "\n" +
                        "8. Agarwal AK. Industrial Microbiology");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1109");
                parent.setText2("Course Title: Chemistry for\nBiotechnologists\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. K. K. Sharma and L. K. Sharma, A text book of Physical Chemistry\n" +
                        "\n" +
                        "2. B.S. Bahl and G.D. Tuli, Essential of Physical Chemistry, S. Chand and Company Ltd.2006\n" +
                        "\n" +
                        "3. Morrison and Boyed, Organic Chemistry.\n" +
                        "\n" +
                        "4. Ficser and Fisser, Organic Chemistry.\n" +
                        "\n" +
                        "5. I. L. Finer, Organic Chemistry (Volume: 1 and 2).\n" +
                        "\n" +
                        "6. V.M. Khanna, M.M. Kapur, and V.P. Sharma, Physical Chemistry\n" +
                        "\n" +
                        "7. N. Kundu and S.K. Jain, Physical Chemistry\n" +
                        "\n" +
                        "8. Morris, J. G. A, Biologist’s Physical Chemistry\n" +
                        "\n" +
                        "9. Gillman, Organic Chemistry.");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1110");
                parent.setText2("Course Title: Chemistry for Biotechnologists Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "1. K. K. Sharma and L. K. Sharma, A text book of Physical Chemistry\n" +
                        "\n" +
                        "2. B.S. Bahl and G.D. Tuli, Essential of Physical Chemistry, S. Chand and Company Ltd.2006\n" +
                        "\n" +
                        "3. Morrison and Boyed, Organic Chemistry.\n" +
                        "\n" +
                        "4. Ficser and Fisser, Organic Chemistry.\n" +
                        "\n" +
                        "5. I. L. Finer, Organic Chemistry (Volume: 1 and 2).\n" +
                        "\n" +
                        "6. V.M. Khanna, M.M. Kapur, and V.P. Sharma, Physical Chemistry\n" +
                        "\n" +
                        "7. N. Kundu and S.K. Jain, Physical Chemistry\n" +
                        "\n" +
                        "8. Morris, J. G. A, Biologist’s Physical Chemistry\n" +
                        "\n" +
                        "9. Gillman, Organic Chemistry.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1111");
                parent.setText2("Course Title: Fundamental of\nComputer Science\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "\n" +
                        "1. C. S. Frence, Computer Science (6th edition), Thomson Learning Pub.\n" +
                        "\n" +
                        "2. Peter Norton, Inside the PC (6th edition), SAMS Pub.");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 1112");
                parent.setText2("Course Title: Fundamental of\nComputer Science Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References\n" +
                        "1. C. S. Frence, Computer Science (6th edition), Thomson Learning Pub.\n" +
                        "\n" +
                        "2. Peter Norton, Inside the PC (6th edition), SAMS Pub.");
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
            inflater = LayoutInflater.from(bge11.this);
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

