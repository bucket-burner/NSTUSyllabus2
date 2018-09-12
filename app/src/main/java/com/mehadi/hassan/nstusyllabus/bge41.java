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


public class bge41 extends  ExpandableListActivity
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
                parent.setText1("Course Code: BGE 4101");
                parent.setText2("Course Title: Cell Signalling\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References:\n" +
                        "\n" +
                        "1.	Molecular Biotechnology. Glick, B.R. and Pasternak, J.J. 2003.ASM Press, USA.\n" +
                        "\n" +
                        "2.	DNA cloning 1 and 2. Glover, D.M. and Hames, B.D. 1995. IRL Press (Oxford University Press, USA).\n" +
                        "\n" +
                        "3.	Molecular Biology of the Cell (4th edition). Alberts, Johnson, Lewis, Raff, Roberts and Walter.\n" +
                        "\n" +
                        "4.	Molecular Cell Biology (5th edition). Lodish, Berk, Matsudaira, Kaiser, Krieger, Scott, Zipersky and Darnell.\n" +
                        "\n" +
                        "5.	Lehninger Principles of Biochemistry (4th edition).Nelson and Cox.\n" +
                        "\n" +
                        "6. Molecular Biology of the Gene. Watson, Baker, Bell.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4103");
                parent.setText2("Course Title: Environmental Biotechnology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "1.	Microbial Ecology: Fundamentals and Applications. Atlas and Bartha. Fourth Edition. Benjamin Cummings Publishers.\n" +
                        "\n" +
                        "2.	Biotechnology and Environment. Trivedi, R N, Yadav, Seema. Anmol Publications\n" +
                        "\n" +
                        "3.	A text book of Environmental Chemistry and Pollution Control. Dogra S S. Swastik Publishers.\n" +
                        "\n" +
                        "4.	Environmental Biotechnology. Young, M. M.,1997. Elsevier Pub. Ltd. Netherlands\n" +
                        "\n" +
                        "5.	Environment and Biotechnology. Sohal M.S., 1994. Anish Publishing House, New Delhi.\n" +
                        "\n" +
                        "6.	Introduction to Environmental Engineering- Davis. L., and D. a. Cornwell, 1991. Second edition , McGraw-n Hill Inc.\n" +
                        "\n" +
                        "7.	Food Processing and Waste Management, Green j.H. 1979. AVI Pub. Co. Inc. Westport\n" +
                        "\n" +
                        "8.	Comprehensive Biotechnology. Moo- Young, M. M, 1985. Pergamon Press Ltd Oxford, England.\n" +
                        "\n" +
                        "9.	Microbial Biotechnology: Fundamentals of Applied Microbiology. Glazer AN andNokaido H. Second Edition. Cambridge University press\n" +
                        "\n" +
                        "10.	Wise DL. Biotreatment system. Vol 2. CRC press\n" +
                        "\n" +
                        "11.	Molecular approaches to environmental Microbiology- pickup RW and Sunders OJR. Ellis horward\n" +
                        "\n" +
                        "12.	Microbial Ecology- A conceptual approach. Lynch jm and poole. Willy \n" +
                        "\n" +
                        "13.	Environmental Biotechnology- Alan Scragg. Pearson Education limited, England\n" +
                        "\n" +
                        "14.	Environmental Biotechnology by S.N. Jogdand. Himalaya Publishing House. Bombay\n" +
                        "\n" +
                        "15.	Waste water Engineering- Treatment, Disposal and Reuse, Metcalf and eddy, Inc, Tata McGraw Hill, NewDelhi\n" +
                        "\n" +
                        "16.	Environmental Chemistry by A. K. De Wiley Eastern Ltd. New Delhi\n" +
                        "\n" +
                        "17.	Introduction to Biodeterioration by D. Allsopp and K. J. Seal, ELBS/ Edward Arnold");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4104");
                parent.setText2("Course Title: Environmental Biotechnology\nPractical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Environmental Biotechnology\"");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4105");
                parent.setText2("Course Title: Molecular Diagnostics\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Freefelder, D. 1985. Essentials of Molecular Biology. Narosa Publishing House. New Dilhi.\n" +
                        "\n" +
                        "2.	Fowler, E. A. 1993. Techniques for Engineering Genes. Butterworth-Heinemann Ltd., UK.\n" +
                        "\n" +
                        "3.	Gupta, P. K. 1997. Cell and molecular Biology. Rastogi Pub., India.\n" +
                        "\n" +
                        "4.	Henry, R. J. 1984. Lab. applications of Plant Molecular Biology. Chapman and Hall Pub., London.\n" +
                        "\n" +
                        "5.	Micklos, D. A. and G. A. Freyer. 1990. DNA Science, Cold Spring Harbor Lab Press, New York.\n" +
                        "\n" +
                        "6.	Stansfield, W. D. 1996. Theory and Problems of Molecular and Cell Biology. McGraw Hill Co. New York.\n" +
                        "\n" +
                        "7.	Weising, K. H., H. Nybom, K. Woff and W. Meyer. 1995. DNA Fingerprinting in Plants and Fungi. CRC Press, USA. ");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4106");
                parent.setText2("Course Title: Molecular Diagnostics\nPractical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Freefelder, D. 1985. Essentials of Molecular Biology. Narosa Publishing House. New Dilhi.\n" +
                        "\n" +
                        "2.	Fowler, E. A. 1993. Techniques for Engineering Genes. Butterworth-Heinemann Ltd., UK.\n" +
                        "\n" +
                        "3.	Gupta, P. K. 1997. Cell and molecular Biology. Rastogi Pub., India.\n" +
                        "\n" +
                        "4.	Henry, R. J. 1984. Lab. applications of Plant Molecular Biology. Chapman and Hall Pub., London.\n" +
                        "\n" +
                        "5.	Micklos, D. A. and G. A. Freyer. 1990. DNA Science, Cold Spring Harbor Lab Press, New York.\n" +
                        "\n" +
                        "6.	Stansfield, W. D. 1996. Theory and Problems of Molecular and Cell Biology. McGraw Hill Co. New York.\n" +
                        "\n" +
                        "7.	Weising, K. H., H. Nybom, K. Woff and W. Meyer. 1995. DNA Fingerprinting in Plants and Fungi. CRC Press, USA.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4107");
                parent.setText2("Course Title: Medical and Pharmaceutical\nBiotechnology I\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Biopharmaceuticals; Biochemistry and Biotechnology by Gray Walsh, 2ndEdn.,John Wiley 2002.\n" +
                        "\n" +
                        "2.	Biotechnology and Biopharmaceuticals by Rodney J.Y. Ho and Milo Gibaldi.\n" +
                        "\n" +
                        "3.	Pharmaceutical Microbiology. Edited by-W.B, Hugo & A.D. Russel, 1993.\n" +
                        "\n" +
                        "4.	Perspectives in Pharmaceutical, Food and Environment Industries. Edited by R.G. Board M.C. Allowodd and J.G.Bank Blackwell Scientific Publication, 1987.\n" +
                        "\n" +
                        "5.	AanCrommelin, Robert Dsindler, “Pharmaceutical Biotechnology”, Tailor and Francis Publications, New York, 2002. Jay P Rho, Stan G Louie, “Hand Book of Pharmaceutical Biotechnology”, Pharmaceutical Products Press, New York, 2003.	");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4109");
                parent.setText2("Course Title: Genomics, Proteomics\nand Bioinformatics\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Bioinformatics: Sequence and Genome Analysis. David W. Mount. Cold Spring Harbor Laboratory Press.\n" +
                        "\n" +
                        "2.	Essential Bioinformatics. Jin Xiong. Cambridge University Press. 2006.\n" +
                        "\n" +
                        "3.	Introduction to Bioinformatics. Arthur M. Lesk. Oxford University Press. 2002.\n" +
                        "\n" +
                        "4.	Bioinformatics: From Genomes to Drugs. Edited by Thomas Lengauer.Wiley-VCH. 2002.\n" +
                        "\n" +
                        "5.	Lecture Notes on Biological Sequence Analysis. Martin Tompa. 2000.\n" +
                        "\n" +
                        "6.	Bioinformatics.A Practical Guide to the Analysis of Genes and Proteins.Andreas D. Baxevanis.2nd Edition.WileyInterscience. 2002.\n" +
                        "\n" +
                        "7.	Bioinformatics Computing. Bryan Bergeron. Prentice Hall PTR. 2002.\n" +
                        "\n" +
                        "8.	Blast. Joseph Bedell. Ian Korf, Mark Yandell. O’reilly. 2003.\n" +
                        "\n" +
                        "9.	Developing Bioinformatics Computer Skills.CynthiaGibas, Per Jambeck.O’reilly. 2001.\n" +
                        "\n" +
                        "10.	Richard J. Simpson, Protein and Proteomics, A Laboratory Manual.\n" +
                        "\n" +
                        "T. A. Brown, Genomes, second edition.A. Altman.Agricultural Biotechnology.\n" +
                        "\n" +
                        "11.	Discovering Genomics, Proteomics, & Bioinformatics. Campbell &Heyer (2003) Pearson Education, ISBN: 0-8053-4722-4\n" +
                        "\n" +
                        "12.	Bioinformatics, Methods of Biochemical Analysis Series Vol. 43, Baxevanis& Ouellette (2001) John Wiley & Sons, ISBN 0-471-38391-0.\n" +
                        "\n" +
                        "13.	Computational Molecular Biology.Pevzner, P.A. (2000) MIT Press, ISBN: 0262161974.\n" +
                        "\n" +
                        "14.	Bioinformatics: A Lab. Guide to the Analysis of Genes and Proteins. Andreas D. Baxevanis& B. F. Francis Ouellette (2004). 3rd Edition. Wiley & Sons, ISBN: 0-471-47878-4.");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4110");
                parent.setText2("Course Title: Genomics, Proteomics\nand Bioinformatics Practicall\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Genomics, Proteomics and Bioinformatics\"");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4111");
                parent.setText2("Course Title: Research Methodology\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                "\n" +
                        "1.	M. Nurul Islam. An Introduction to Research Methods.Mullick and Brothers. 2009. Dhaka.  \n" +
                        "\n" +
                        "2.	Kothari, C.R., 1990. Research Methodology: Methods and Techniques. Wiley Estern. Ltd., India. \n" +
                        "\n" +
                        "3.	BARI/BARC, 1990.Resource Manual of Research Planning and Evaluation Training Course.BARI, Gazipur-1701, Bangladesh.\n" +
                        "\n" +
                        "4.	Singh, A.K., 1993. Tests, Measurements and Research Methods in Behavioral Sciences, Tata McGraw-Hill Pub.Co, New Delhi, India.");
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
            inflater = LayoutInflater.from(bge41.this);
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

