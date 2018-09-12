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


public class econo42 extends  ExpandableListActivity
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
        for (int i = 1; i < 8; i++)
        {
            //Create parent class object
            final Parent parent = new Parent();

            // Set values in parent class object
            if(i==1){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4201");
                parent.setText2("Course Title: Development Economics-II\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("Book References\n" +
                        "\n" +
                        "1. M.P. Todaro and S.C. Smith. Economic Development. 11th Edition, Addison-Wesley.\n" +
                        "\n" +
                        "2. C.K. Wilber (Ed.). The Political Economy of Development and Underdevelopment.\n" +
                        "\n" +
                        "3. Nancy Baster (Ed.). Measuring Development.\n" +
                        "\n" +
                        "4. W.L. Johnson and D.R. Mamersohen (Ed.). Reading in Economic Development.\n" +
                        "\n" +
                        "5. David Coleman and Frederick Nixon. Economics of Changes in Less Developed Countries.\n" +
                        "\n" +
                        "6. Gunner Mydral. Asian Drama.\n" +
                        "\n" +
                        "7. B. Okun and R.W. Fichardson (Ed.). Studies in Economic Development.\n" +
                        "\n" +
                        "8. Samir Amin. Accumulation on a World Scale.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4203");
                parent.setText2("Course Title: Bangladesh Economy-II\ncredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("Book References\n" +
                        "\n" +
                        "1. BER, MoF, Government of Bangladesh.\n" +
                        "\n" +
                        "2. BEA: Bangladesh Journal of Political Economy, Bangladesh Economic Association (BEA), various issues.\n" +
                        "\n" +
                        "3. BIDS: Bangladesh Development Studies, Bangladesh Institute of Development Studies (BIDS), various issues.\n" +
                        "\n" +
                        "4. Hossain, Mosharraf (1992): Agriculture in Bangladesh, Problems, Policies & Prospects, University Press Limited, Dhaka.\n" +
                        "\n" +
                        "5. Khan, A R (1973): The Economy of Bangladesh, Macmillan.\n" +
                        "\n" +
                        "6. Rashid, Selim (1995): Bangladesh Economy, University Press Limited, Dhaka.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4205");
                parent.setText2("Course Title: International Finance\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Krugman,P., Obsfeld, M. and M. Melitz (2011). International Economics: Theory and Policy, 9th Edition, Addison- Wesley.\n" +
                        "\n" +
                        "2. Caves, R. E., J. A. Frankel and R. W. Jones (2006). World Trade and Payments - An Introduction, 10th Edition, Addison-Wesley.\n" +
                        "\n" +
                        "3. Dornbusch, R. (1980), Open Economy Macroeconomics, Cambridge University Press.\n" +
                        "\n" +
                        "4. Melvin, M. and S. Norrbin (2012). International Money and Finance, 8th Edition, Academic Press.\n" +
                        "\n" +
                        "5. Sodersten, B. and G. Reed (1994). International Economics, 3rd Edition, Palgrave MacMillan.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4207");
                parent.setText2("Course Title: History of\nEconomic Thought\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Spiegel, Henry William. The Growth of Economic Thought, Duke University Press, Durban, North Carolina, latest edition.\n" +
                        "\n" +
                        "2. Roll, Eric. A History of Economic Thought, Prentice-Hall, Third edition.\n" +
                        "\n" +
                        "3. Ekelund, R B and R F Hebert. A History of Economic Theory and Method, McGraw-Hill, latest edition.\n" +
                        "\n" +
                        "4. Koutilya (1992). Arthashastra, Edited by L N Rangaranjan, Penguin Publishing, New Delhi, India, Sixth edition.\n" +
                        "\n" +
                        "5. Freedman, Robert (ed). Marx on Economics, Pelican Books.\n" +
                        "\n" +
                        "6. Giddens, Anthony (1971). Capitalism and Modern Social Theory-An Analysis of the Writings of Karl Marx, Durkheim and Max Weber; Cambridge University Press, UK.\n" +
                        "\n" +
                        "7. Hausman D M: The Philosophy of Economics: an Anthology, Second Edition");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4210");
                parent.setText2("Course Title: Research Paper\n(Optional: Only CGPA 3.50\nand above may take)\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "Individual student has to prepare appropriate research proposal on topic related to Economics under the supervision of departmental teachers.\n" +
                        "\n" +
                        "Individual student is required to present his/her research paper in departmental seminar. All students have to face an oral examination by the teachers of the department.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4211");
                parent.setText2("Course Title: Monetary Economics\n(Optional)\nCredit: 4.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Book References\n" +
                        "\n" +
                        "1. Lewis, M. K. and P. D. Mizen (2000). Monetary Economics, Oxford University Press.\n" +
                        "\n" +
                        "2. Mishkin, F. S. (2000). The Economics of Money Banking, and Financial Markets, Addison -Wesley.\n" +
                        "\n" +
                        "3. Walsh, C. E. (2010). Monetary Theory and Policy, 3rd Edition, the MIT Press.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: ECO 4212");
                parent.setText2("Course Title: Viva Voce\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("Coming soon.........................." +
                        "............................" +
                        "........................" +
                        "..................");
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
            inflater = LayoutInflater.from(econo42.this);
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

