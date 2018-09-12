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


public class bge22 extends  ExpandableListActivity
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
        for (int i = 1; i < 13; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2201");
                parent.setText2("Course Title: Metabolism I\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References:\n" +
                        "\n" +
                        "1.	Lehninger, Nelson, Cox,: Principles of Biochemistry\n" +
                        "\n" +
                        "2.	Lubert Stryer: biochemistry, 3rd edition.\n" +
                        "\n" +
                        "3.	A.C. Dev: Fundamental of Biochemistry.\n" +
                        "\n" +
                        "4.	Voet and Voet: Biochemistry\n" +
                        "\n" +
                        "5.	Alberts, B. Bray, D. Lewis, J., 1989; Molecular Biology of the cell");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2202");
                parent.setText2("Course Title: Metabolism I Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of Metabolism I");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2203");
                parent.setText2("Course Title: Molecular Genetics\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Watson, J.D. and Zoller, M: Recombinant DNA.\n" +
                        "\n" +
                        "2.	Bruce Albert’s, D. Bray J. Lewis, M. Raff, K. Roberts, J.D. Watson: Molecular Biology of the Cell.\n" +
                        "\n" +
                        "3.	Turner, P.C. Lennan, A.G. and Whites, M.R.H: Molecular Biology.\n" +
                        "\n" +
                        "4.	Benjamin Lewin: Genes VII and VII.\n" +
                        "\n" +
                        "5.	Stryer, L: Biochemistry\n" +
                        "\n" +
                        "6.	Sunstad, D.P. Simmons, M.J. and Jenkins, J.B. 1997: Principles of Genetics");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2205");
                parent.setText2("Course Title: Plant Breeding\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Singh, B.D: Plant Breeding: Principles and methods.\n" +
                        "\n" +
                        "2.	Simonds, N.W: Principles of Plant Breeding.\n" +
                        "\n" +
                        "3.	Allard, R.W: Principles of Plant Breeding.\n" +
                        "\n" +
                        "4.	Shukla, R.S: Cytogenetics, Evolution and Plant Breeding.\n" +
                        "\n" +
                        "5.	Chowdhury, H.R: Elementary Principles of Plant Breeding.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2206");
                parent.setText2("Course Title: Plant Breeding Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Plant Breeding\"");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2207");
                parent.setText2("Course Title: Plant Physiology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Fundamentals of Plant Physiology: Dr. V.K. Jain\n" +
                        "\n" +
                        "2.	Noggle, G.R.  and Fritz, G.T: Introductory Plant Physiology.\n" +
                        "\n" +
                        "3.	Salisbury, F.B. and Ross, C.W: Plant Physiology.\n" +
                        "\n" +
                        "4.	Witham and R.M. Devlin:  Plant Physiology.\n" +
                        "\n" +
                        "5.	Wilkins, Ed. M.B: Advanced Plant Physiology.\n" +
                        "\n" +
                        "6.	leopoid, A.C.  and Kriedman, P.E: Plant Growth and Development.\n" +
                        "\n" +
                        "7.	Moore, T.C: Biochemistry and Physiology of Plant Hormones.\n" +
                        "\n" +
                        "8.	Bouchanoa: Plant Physiology.\n" +
                        "\n" +
                        "9.	Fundamentals of plant physiology and biochemistry");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2208");
                parent.setText2("Course Title: Plant Physiology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Plant Physiology\"");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2209");
                parent.setText2("Course Title: Analytical Methods\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Lehninger, Nelson, Cox,: Principles of Biochemistry\n" +
                        "\n" +
                        "2.	R. C. Dubey: Introduction to Biotechnology.\n" +
                        "\n" +
                        "3.	Lubert Stryer: biochemistry, 3rd edition.\n" +
                        "\n" +
                        "4.	A.C. Dev: Fundamental of Biochemistry.\n" +
                        "\n" +
                        "5.	Voet and Voet: Biochemistry\n" +
                        "\n" +
                        "6.	Alberts, B. Bray, D. Lewis, J., 1989; Molecular Biology of the cell\n" +
                        "\n" +
                        "7.	Sambrook et.al. Molecular Cloning: A Laboratory Manual. Cold Spring Harber Lab Press.\n" +
                        "\n" +
                        "8.	 Freifelder, D. Physical Biochemistry.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2210");
                parent.setText2("Course Title: Analytical Methods Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Please follow the references of \"Analytical Methods\"");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2211");
                parent.setText2("Course Title: Biostatistics\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Fowler, J. Cohen, L. and Jarvis, P: Practical Statistics for Field Biology.\n" +
                        "\n" +
                        "2.	Bishop, O.N: Statistics for Biology.\n" +
                        "\n" +
                        "3.	Cochran, W.C.  and Cox, G.M: Experimental Design.\n" +
                        "\n" +
                        "4.	Verma, B.L., Shukla, G.D.  and Srivastave, R.N: Biostatistics.\n" +
                        "\n" +
                        "5.	Goodman, R.C.C: Teach Yourself Statistics.");
                parent.getChildren().add(child3);
            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2213");
                parent.setText2("Course Title: Field Trip\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
                parent.getChildren().add(child3);
            }
            else if(i==12){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2215");
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
            inflater = LayoutInflater.from(bge22.this);
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

