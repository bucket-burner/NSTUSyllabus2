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


public class bge21 extends  ExpandableListActivity
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
                parent.setText1("Course Code: BGE 2101");
                parent.setText2("Course Title: Molecular Biology II\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References:\n" +
                        "\n" +
                        "1.	Lehninger, Nelson and Cox: Principles of Biochemistry.\n" +
                        "\n" +
                        "2.	Snustad, D.P. Simmons, M.J. and Jenkins, J.B. 1997: Principles of Genetics, Jacaranda / Wiely publishers.\n" +
                        "\n" +
                        "3.	Watson, J.D., Hopkins, A.M., Roberts, J.W., Steitz, J.A. and Weiner, A.M. 1988: Molecular Biology of the Gene, Benjamin/Cummings Scientific Publishing, California. \n" +
                        "\n" +
                        "4.	Watson, J.D. and .Zoller, M: Recombinant DNA.\n" +
                        "\n" +
                        "5.	Turner, P.C. Lennan, A.G. and Whites, M.R.H: Molecular Biology.\n" +
                        "\n" +
                        "6.	Benjamin Lewin: Genes VII & VIII. \n" +
                        "\n" +
                        "7.	Stryer, L: Biochemistry.\n" +
                        "\n" +
                        "8.	Sambrook, J., Fritsch, E.F., Mariatis., 1999: Molecular Cloning, A laboratory Manual, Cold Spring Harbor Laboratory, USA.\n" +
                        "\n" +
                        "9.	Bruce Alberts, D. Bray, J. Lewis, M. Raff, K. Roberts, J. D. Watson: Molecular Biology of the Cell. \n" +
                        "\n" +
                        "10.	Frefelder, D: Molecular Biology.\n" +
                        "\n" +
                        "11.	Klung, W.S. and Cummings, M.R. 1980: Concepts of Genetics, Scott, Foresman and Company USA.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2102");
                parent.setText2("Course Title: Molecular Biology II\nPractical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of Molecular Biology II");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2103");
                parent.setText2("Course Title: Enzymology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Boyer: The enzymes\n" +
                        "\n" +
                        "2.	Satyanarayana, U., Chalkapari, U.: Biochemistry.\n" +
                        "\n" +
                        "3.	Dev, A. C.: Biochemistry. Fourth Edition.\n" +
                        "\n" +
                        "4.	Jain, V. K.: Biochemistry.\n" +
                        "\n" +
                        "5.	Malcom Dixon and Edwin C. Webb: Enzymes.\n" +
                        "\n" +
                        "6.	Alan Fersht: Enzyme Structure and Mechanism\n" +
                        "\n" +
                        "7.	Lehninger, A.L: Biochemistry\n" +
                        "\n" +
                        "8.	Engle, F.C: Enzyme Kinetics\n" +
                        "\n" +
                        "9.	Stryer, Lubert. Biochemistry:  W. H. Freeman and Company, San Francisco. (1981).\n" +
                        "\n" +
                        "10. Christonpher Walsh: Enzymatic Reaction Mwchanisms.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2105");
                parent.setText2("Course Title: Plant Tissue Culture\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	De, K. k.: Introduction to Plant Tissue Culture.\n" +
                        "\n" +
                        "2.	Jack G. Chirikjian. Biotechnology: Theory and techniques. Volume 1. Jones and Bartlett Publishers, Boston, London (1995).\n" +
                        "\n" +
                        "3.	Kenneth C. Torres, Tissue Culture Techniques for Horticultural Crops. Van Nostrand Reinhold, New York. (1989).\n" +
                        "\n" +
                        "4.	RazdanM. K. An Introduction to Plant Tissue Culture. Oxford & IBH Publishing Co. Pvt. Ltd., New Delhi, Callcutta, India. (1993).\n" +
                        "\n" +
                        "5.	Singh, B. D.: Biotechnology.\n" +
                        "\n" +
                        "6.	 Dubey, R. C.: A Text book of Biotechnology.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2106");
                parent.setText2("Course Title: Plant Tissue\nCulture Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Plant Tissue Culture\"");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2107");
                parent.setText2("Course Title: Food and Nutrition\nBiotechnology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Andrews, S: Food and Beverages Service Training Manual\n" +
                        "\n" +
                        "2.	Belitz, Grosch, Scheiberle: Food Chemistry. Fourth Edition\n" +
                        "\n" +
                        "3.	Meyer: Food Chemistry. \n" +
                        "\n" +
                        "4.	Potter, N. N., Hotchkiss, J. H.: Food Science. Sixth edition.\n" +
                        "\n" +
                        "5.	King, R.D: Food Technology\n" +
                        "\n" +
                        "6.	Chowdhury, A.C: Practical Dairy Science and Laboratory Method\n" +
                        "\n" +
                        "7.	Kosikowskim, F: Cheese and Fermented Milk Food.\n" +
                        "\n" +
                        "8.	Suniate, R.M. and M.V. Raja opal: Fundamentals of Food and Nutrition\n" +
                        "\n" +
                        "9.	Channels Alcis and Guy Linden: Food Biochemistry\n" +
                        "\n" +
                        "10.	Swami Nathan, M: Hand Book of Food and Nutrition");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2108	");
                parent.setText2("Course Title: Food and Nutrition\nBiotechnology Practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "Please follow the references of \"Food and Nutrition Biotechnology\"");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2109");
                parent.setText2("Course Title: Human Biology II\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Gyton, M.D: Text book of Medical  Physiology\n" +
                        "\n" +
                        "2.	P and K Sembulingam: Medical Physiology.\n" +
                        "\n" +
                        "3.	Chattrerjee, C.C: Human Physiology, Vol. I and II\n" +
                        "\n" +
                        "4.	William, F. Ganong, 2006: Review of Medical Physiology\n" +
                        "\n" +
                        "5.	Elaine, N: Human Anatomy and Physiology (4th edition)\n" +
                        "\n" +
                        "6.	Shana and Ghosh: Human Physiology\n" +
                        "\n" +
                        "7.	Smith, E. Pateson. C. R. Scratecherd, T. and Read, N. W. 1988, Text book of Physiology. Hong kong.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2110");
                parent.setText2("Course Title: Human Biology II\nPractical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Please follow the references of \"Human Biology II\"");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 2111");
                parent.setText2("Course Title: Economics\nCredit: 2.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	A. I. Ahuja. Modern Economics.\n" +
                        "\n" +
                        "2.	Dr. I. Sunder. Introduction to Bioeconomics.");
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
            inflater = LayoutInflater.from(bge21.this);
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

