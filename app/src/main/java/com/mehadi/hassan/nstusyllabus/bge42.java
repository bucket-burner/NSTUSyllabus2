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


public class bge42 extends  ExpandableListActivity
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
        for (int i = 1; i < 9; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4201");
                parent.setText2("Course Title: Bioprocess Technology\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References:\n" +
                        "\n" +
                        "1.	Biotechnology 2nd edition.vol.3. Bioprocessing Rehm H-j & Reed G.\n" +
                        "\n" +
                        "2.	Hand book of indigenous fermented foods. K.H Steinkraus.\n" +
                        "\n" +
                        "3.	Food, feed and fuel from biomass; Chahal DS.\n" +
                        "\n" +
                        "4.	Biotechnology and renewable energy,Moo-Young M. Biotechnology of industrial\n" +
                        "\n" +
                        "1.	antibiotics. Vandamme E.J.\n" +
                        "\n" +
                        "5.	Prescott and Dunn’s industrial microbiology-G-Reed.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4203");
                parent.setText2("Course Title: GMOs and Bio-safety\nRegulations\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "1.	Maurizio G., Paoletti and David Pimentel: Genetic Engineering in Agriculture and the Environment: Assessing Risk and Benefits. \n" +
                        "\n" +
                        "2.	Rissler, J. and Mellon, M., 1996: The Ecological Risks of Engineered Crops.\n" +
                        "\n" +
                        "3.	Biosafety guidelines of Bangladesh. Ministry of Environment and forest, Government of the people’s Republic of Bangladesh.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4205");
                parent.setText2("Course Title: Medical and\nPharmaceuticals Biotechnology II\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Biopharmaceuticals; Biochemistry and Biotechnology by Gray Walsh, 2nd Edn.,John Wiley 2002.\n" +
                        "\n" +
                        "2.	Biotechnology and Biopharmaceuticals by Rodney J.Y. Ho and Milo Gibaldi.\n" +
                        "\n" +
                        "3.	Pharmaceutical Microbiology. Edited by-W.B, Hugo & A.D. Russel, 1993.\n" +
                        "\n" +
                        "4.	Perspectives in Pharmaceutical, Food and Environment Industries. Edited by R.G. Board M.C. Allowodd and J.G.Bank Blackwell Scientific Publication, 1987.\n" +
                        "\n" +
                        "5.	Aan Crommelin, Robert Dsindler, “Pharmaceutical Biotechnology”, Tailor and Francis Publications, New York, 2002.\n" +
                        "\n" +
                        "6.	Jay P Rho, Stan G Louie, “Hand Book of Pharmaceutical Biotechnology”, Pharmaceutical Products Press, New York, 2003.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4207");
                parent.setText2("Course Title: Animal Biotechnology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Glick, B.R.: Molecular Biotechnology, Third Edition.\n" +
                        "\n" +
                        "2.	Brackett, G. Benjamin. New Technologies in Animal Breeding, Academic Press, NY (1981).\n" +
                        "\n" +
                        "3.	Gordon, I. Controlled Breeding in Farm Animals. Pergamon Press, Oxford, NY. (1983).\n" +
                        "\n" +
                        "4.	Hafez, E.S.E. Reproduction in Farm Animals. LEA and Febiger, Philadelphia. (1987).");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4208");
                parent.setText2("Course Title: Animal Biotechnology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Glick, B.R.: Molecular Biotechnology, Third Edition.\n" +
                        "\n" +
                        "2.	Brackett, G. Benjamin. New Technologies in Animal Breeding, Academic Press, NY (1981).\n" +
                        "\n" +
                        "3.	Gordon, I. Controlled Breeding in Farm Animals. Pergamon Press, Oxford, NY. (1983).\n" +
                        "\n" +
                        "4.	Hafez, E.S.E. Reproduction in Farm Animals. LEA and Febiger, Philadelphia. (1987).");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4209");
                parent.setText2("Course Title: Project and Seminar\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4211");
                parent.setText2("Course Title: Field Trip\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 4213");
                parent.setText2("Course Title: Course Viva\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
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
            inflater = LayoutInflater.from(bge42.this);
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

