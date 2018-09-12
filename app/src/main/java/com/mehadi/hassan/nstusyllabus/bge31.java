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


public class bge31 extends  ExpandableListActivity
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
                parent.setText1("Course Code: BGE3101");
                parent.setText2("Course Title: Metabolism II                                                        \ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3103");
                parent.setText2("Course Title: Fermentation Technology\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "1. H. C. Vogel, C. C. Haber. Fermentation and Biochemical Engineering Handbook, 2nd Ed. Principles, Process Design and Equipment. Noyes Publications, New Jersey, U. S.\n" +
                        "\n" +
                        "2. J. E. Bailey and D.F. Ollis, Biochemical Engineering Fundamentals, 2nd Ed., McGraw Hill Publishers, 1986.\n" +
                        "\n" +
                        "3. M. L. Shuler and F. Kargi, Bioprocess Engineering-Basic Concepts, 2nd Ed., Prentice Hall, 2004.\n" +
                        "\n" +
                        "4. P. M. Doran, Bioprocess Engineering principles, 2nd Edition, Academic Press, 2005.\n" +
                        "\n" +
                        "5. P.F. Stanbury, S. J. Hall and A. Whitaker, Principles of Fermentation Technology, 2nd Ed., Elsevier, Science & Technology Books, 2005.\n" +
                        "\n" +
                        "6. J. M. lee, Biochemical Engineering, 1st Ed., Prentice Hall, 1991.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3105");
                parent.setText2("Course Title: Microbial Genetics\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Snustad, D. P. Simmons, M.J. and Jenkins. J.B: Principles of Genetics.\n" +
                        "\n" +
                        "2.	Hardy, K.M.: Bacterial Plasmid.\n" +
                        "\n" +
                        "3.	Suziki, Griffith and Miller: Introduction to Genetic Analysis.\n" +
                        "\n" +
                        "4.	Avers, X.J: Genetics.\n" +
                        "\n" +
                        "5.	Brock, T.D.,  Modigan, M.T.,  Martin Co, J.M. and Parker, J. (1990): Biology of Microorganisms.\n" +
                        "\n" +
                        "6.	David Freifelder: Microbial Genetics.\n" +
                        "\n" +
                        "7.  Strickberger, M.W. Genetics. Macmillan pub. Co. NY. 1990.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3106");
                parent.setText2("Course Title: Microbial Genetics Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Microbial Genetics\"");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3107");
                parent.setText2("Course Title: Clinical and Molecular\nbasis of Diseases\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Harper’s: Review of Biochemistry\n" +
                        "\n" +
                        "2. Devlin, 1997: Text Book of Biochemistry with Clinical Correlations\n" +
                        "\n" +
                        "3. John Macloed, 1988: Davidson’s principles and Practice of Medicine\n" +
                        "\n" +
                        "4. Gillham, B., Despo, K.P., Thomas, J.H., Will’s, 1997: Biochemical Basis of Medicine.\n" +
                        "\n" +
                        "5. Marshal, J., & Bangert, K: Clinical Biochemistry.\n" +
                        "\n" +
                        "6. Latner, A, L: Clinical Biochemistry.\n" +
                        "\n" +
                        "7. Gowen Lock & Others: Practical Clinical Biochemistry.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3108");
                parent.setText2("Course Title: Clinical and Molecular\nbasis of Diseases practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Harper’s: Review of Biochemistry\n" +
                        "\n" +
                        "2. Devlin, 1997: Text Book of Biochemistry with Clinical Correlations\n" +
                        "\n" +
                        "3. John Macloed, 1988: Davidson’s principles and Practice of Medicine\n" +
                        "\n" +
                        "4. Gillham, B., Despo, K.P., Thomas, J.H., Will’s, 1997: Biochemical Basis of Medicine.\n" +
                        "\n" +
                        "5. Marshal, J., & Bangert, K: Clinical Biochemistry.\n" +
                        "\n" +
                        "6. Latner, A, L: Clinical Biochemistry.\n" +
                        "\n" +
                        "7. Gowen Lock & Others: Practical Clinical Biochemistry.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3109");
                parent.setText2("Course Title: Recombinant DNA\nTechnology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Glick, B.R. and Pasternak, J.J. 1988: Molecular Biotechnology.\n" +
                        "\n" +
                        "2. Glover, D.M. and Hames, B.D. 1995: DNA Cloning 1 and 2.\n" +
                        "\n" +
                        "3. Sambrook, J., Fritsch, E.F., Mariatis., 1999: Molecular Cloning, A laboratory Manual.\n" +
                        "\n" +
                        "4. Watson, 1992: Recombinant DNA.");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3110");
                parent.setText2("Course Title: Recombinant DNA Technology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Glick, B.R. and Pasternak, J.J. 1988: Molecular Biotechnology.\n" +
                        "\n" +
                        "2. Glover, D.M. and Hames, B.D. 1995: DNA Cloning 1 and 2.\n" +
                        "\n" +
                        "3. Sambrook, J., Fritsch, E.F., Mariatis., 1999: Molecular Cloning, A laboratory Manual.\n" +
                        "\n" +
                        "4. Watson, 1992: Recombinant DNA.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3111");
                parent.setText2("Course Title: Virology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                                "\n" +
                                "1. Kumar V., Abbas A. K. and Fausto N. 2005. Pathologic basis Disease. International Edition, Elsevier.\n" +
                        "\n" +
                                "2. Flint S.J. Principles of Virology.");
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
            inflater = LayoutInflater.from(bge31.this);
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

