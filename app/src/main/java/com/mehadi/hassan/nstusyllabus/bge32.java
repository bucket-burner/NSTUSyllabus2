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


public class bge32 extends  ExpandableListActivity
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
                parent.setText1("Course Code: BGE 3201");
                parent.setText2("Course Title: Microbial Biotechnology\ncredit: 3.00");
                parent.setChildren(new ArrayList<Child>());


                final Child child = new Child();
                child.setName("" + i);
                child.setText1("References:\n" +
                        "\n" +
                        "1. Modern Biotechnology: Primrose.\n" +
                        "\n" +
                        "2. Microbial Enzymes and Biotechnology: Fogerty, 1983.\n" +
                        "\n" +
                        "3. Basic Biotechnology: Bullock, 1987.\n" +
                        "\n" +
                        "4. Microbial degradation of organic compounds: Gibson, 1994.\n" +
                        "\n" +
                        "5. Microbial Conversion of Steriod and Alkaloids: Lizuka, 1981.\n" +
                        "\n" +
                        "6. Enzymes and Immobilized Cells in Biotechnology: Laskin, 1985.\n" +
                        "\n" +
                        "7. Single Cell Protein: Davis, 1976\n" +
                        "\n" +
                        "8. A text Book of Biotechnology: Dubey, R. C. 2004. S. Chand & Co. Ltd. New Delhi-110055\n" +
                        "\n" +
                        "9.Biological Nitrogen Fixation: Gary Stacey, Robert H. Burris and Harold J. Evans (1997). First Indian edition, CBS Publishers & Distributors, New Delhi, India.");

//Add Child class object to parent class object
                parent.getChildren().add(child);
            }
            else if(i==2){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3202");
                parent.setText2("Course Title: Microbial Biotechnology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child1 = new Child();
                child1.setName("" + i);
                child1.setText1("References:\n" +
                        "\n" +
                        "1. Modern Biotechnology: Primrose.\n" +
                        "\n" +
                        "2. Microbial Enzymes and Biotechnology: Fogerty, 1983.\n" +
                        "\n" +
                        "3. Basic Biotechnology: Bullock, 1987.\n" +
                        "\n" +
                        "4. Microbial degradation of organic compounds: Gibson, 1994.\n" +
                        "\n" +
                        "5. Microbial Conversion of Steriod and Alkaloids: Lizuka, 1981.\n" +
                        "\n" +
                        "6. Enzymes and Immobilized Cells in Biotechnology: Laskin, 1985.\n" +
                        "\n" +
                        "7. Single Cell Protein: Davis, 1976\n" +
                        "\n" +
                        "8. A text Book of Biotechnology: Dubey, R. C. 2004. S. Chand & Co. Ltd. New Delhi-110055\n" +
                        "\n" +
                        "9.Biological Nitrogen Fixation: Gary Stacey, Robert H. Burris and Harold J. Evans (1997). First Indian edition, CBS Publishers & Distributors, New Delhi, India.");
                parent.getChildren().add(child1);
            }
            else if(i==3){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3203");
                parent.setText2("Course Title: Immunology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Ivan Roitt: Roitts Essential immunology.\n" +
                        "\n" +
                        "2. Roitt and Brostoff : Immunology.\n" +
                        "\n" +
                        "3. Daniel P. Stites. Abba 1 Terr, Tristram G: Medical Immunology.\n" +
                        "\n" +
                        "4. A. K.Abbas, A.H.Licistman, J.S. Pober: Cellular and Molecular Immunology.\n" +
                        "\n" +
                        "5. Jains Kuby: Immunology, W.H. Frecman & Co.N.Y.");
                parent.getChildren().add(child3);
            }
            else if(i==4){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3204");
                parent.setText2("Course Title: Immunology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Ivan Roitt: Roitts Essential immunology.\n" +
                        "\n" +
                        "2. Roitt and Brostoff : Immunology.\n" +
                        "\n" +
                        "3. Daniel P. Stites. Abba 1 Terr, Tristram G: Medical Immunology.\n" +
                        "\n" +
                        "4. A. K.Abbas, A.H.Licistman, J.S. Pober: Cellular and Molecular Immunology.\n" +
                        "\n" +
                        "5. Jains Kuby: Immunology, W.H. Frecman & Co.N.Y.");
                parent.getChildren().add(child3);
            }
            else if(i==5){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3205");
                parent.setText2("Course Title: Plant Genetic\nEngineering\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Grasshoff, P.M.SRC: Series of Current Topics in Plant Molecular Biology, Plant Biotechnology and Development.\n" +
                        "\n" +
                        "2. Anderson, L.A: Plant Cell Culture. Advances in Biochemical Engineering and Biotechnology\n" +
                        "\n" +
                        "3. Watson, 1992: Recombinant DNA.\n" +
                        "\n" +
                        "4. Old, R.W. and Primerose, S.B: Principles of Gene Manipulation. \n" +
                        "\n" +
                        "5. Smith, J.E: Biotechnology.\n" +
                        "\n" +
                        "6. Dubey, R.C: A Text Book of Biotechnology.\n" +
                        "\n" +
                        "7. Chawla, H.S: Plant Biotechnology.\n" +
                        "\n" +
                        "8. Bennet and Lasure, 1985: Gene Manipulations in Fungi.\n" +
                        "\n" +
                        "9. Graniti et al.,1989: Phytotoxins and Plant Pathogenesis.\n" +
                        "\n" +
                        "10. Hill, B.A. 198: Methods in Plant Virology.\n" +
                        "\n" +
                        "11. Vidhyasekaran, P. 1988: Physiology of Disease Resistance in Plants, Vol. I & Vol. II.\n" +
                        "\n" +
                        "12. Burges, M.D.1981: Microbial Control of Pest and Plant Diseases. Academic press  London. \n" +
                        "\n" +
                        "13. Day, P.R. 1986: Biotechnology and Crop Improvement and Protection, BCRC Monograph.");
                parent.getChildren().add(child3);
            }
            else if(i==6){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3206");
                parent.setText2("Course Title: Plant Genetic\nEngineering practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Grasshoff, P.M.SRC: Series of Current Topics in Plant Molecular Biology, Plant Biotechnology and Development.\n" +
                        "\n" +
                        "2. Anderson, L.A: Plant Cell Culture. Advances in Biochemical Engineering and Biotechnology\n" +
                        "\n" +
                        "3. Watson, 1992: Recombinant DNA.\n" +
                        "\n" +
                        "4. Old, R.W. and Primerose, S.B: Principles of Gene Manipulation. \n" +
                        "\n" +
                        "5. Smith, J.E: Biotechnology.\n" +
                        "\n" +
                        "6. Dubey, R.C: A Text Book of Biotechnology.\n" +
                        "\n" +
                        "7. Chawla, H.S: Plant Biotechnology.\n" +
                        "\n" +
                        "8. Bennet and Lasure, 1985: Gene Manipulations in Fungi.\n" +
                        "\n" +
                        "9. Graniti et al.,1989: Phytotoxins and Plant Pathogenesis.\n" +
                        "\n" +
                        "10. Hill, B.A. 198: Methods in Plant Virology.\n" +
                        "\n" +
                        "11. Vidhyasekaran, P. 1988: Physiology of Disease Resistance in Plants, Vol. I & Vol. II.\n" +
                        "\n" +
                        "12. Burges, M.D.1981: Microbial Control of Pest and Plant Diseases. Academic press  London. \n" +
                        "\n" +
                        "13. Day, P.R. 1986: Biotechnology and Crop Improvement and Protection, BCRC Monograph.");
                parent.getChildren().add(child3);
            }
            else if(i==7){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3207");
                parent.setText2("Course Title: Cell and Developmental\nBiology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Alberts B. Johnson, A.  Lewis, J. Raff, M. Roberts, K. Walter, K. 2009: Molecular Biology of The Cell, 6th Edition.\n" +
                        "\n" +
                        "2. Darnell, J. Lodish, H. and Baltimore, D. 1986: Molecular Cell Biology.\n" +
                        "\n" +
                        "3. Howell, S. H: Molecular Genetics of Plant Development.\n" +
                        "\n" +
                        "4. Stephen H., Howell: Molecular Genetics of Plant development.");
                parent.getChildren().add(child3);
            }
            else if(i==8){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3208");
                parent.setText2("Course Title: Cell and Developmental\nBiology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1. Alberts B. Johnson, A.  Lewis, J. Raff, M. Roberts, K. Walter, K. 2009: Molecular Biology of The Cell, 6th Edition.\n" +
                        "\n" +
                        "2. Darnell, J. Lodish, H. and Baltimore, D. 1986: Molecular Cell Biology.\n" +
                        "\n" +
                        "3. Howell, S. H: Molecular Genetics of Plant Development.\n" +
                        "\n" +
                        "4. Stephen H., Howell: Molecular Genetics of Plant development.");
                parent.getChildren().add(child3);
            }
            else if(i==9){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3209");
                parent.setText2("Course Title: Fisheries and Marine\nBiotechnology\nCredit: 3.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                "\n" +
                        "1.	Al- Hajj. A. B. and Farmer, A. S. D. 1984. Shrimp Hatchery Manual. Safut.Kuit Institute for scientific Research.\n" +
                        "\n" +
                        "2.	Bardach, E. J., Ryther, J. H. and McLarney, W. O. , Aquaculture. USA.\n" +
                        "\n" +
                        "3.	Hussain, M. G. and Mozid., M. A. 2000. Breeding Plans, Stock Improvement and Conservation of Carp Genetic Resources in Bangladesh. ICLARM, Dhaka.\n" +
                        "\n" +
                        "4.	Fast, A. W. and Lester, L. J. 1992. Marine Shrimp Culture: Principles and Practices. \n" +
                        "\n" +
                        "5.	Tave, D. 1993. Genetics for Fish Hatchery Managers.Second Edition. Van Nostrand Reinhold Publisher, New York. \n" +
                        "\n" +
                        "6. Tave, D. 1995. Selective Breeding Programs for Medium Size Fish Farms.FAO Fisheries Technical Paper.\n" +
                        "\n" +
                        "7. Ranga,M.M. and Q.J.Shammi (2005). Fish Biotechnology.Agrobios, India.\n" +
                        "\n" +
                        "8. Itami, T, et. al. (1998).Advanced in shrimp biotechnology.National Centre for Genetic Engineering and Biotechnology. Bangkok.");
                parent.getChildren().add(child3);
            }
            else if(i==10){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3210");
                parent.setText2("Course Title: Fisheries and Marine\nBiotechnology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Al- Hajj. A. B. and Farmer, A. S. D. 1984. Shrimp Hatchery Manual. Safut.Kuit Institute for scientific Research.\n" +
                        "\n" +
                        "2.	Bardach, E. J., Ryther, J. H. and McLarney, W. O. , Aquaculture. USA.\n" +
                        "\n" +
                        "3.	Hussain, M. G. and Mozid., M. A. 2000. Breeding Plans, Stock Improvement and Conservation of Carp Genetic Resources in Bangladesh. ICLARM, Dhaka.\n" +
                        "\n" +
                        "4.	Fast, A. W. and Lester, L. J. 1992. Marine Shrimp Culture: Principles and Practices. \n" +
                        "\n" +
                        "5.	Tave, D. 1993. Genetics for Fish Hatchery Managers.Second Edition. Van Nostrand Reinhold Publisher, New York. \n" +
                        "\n" +
                        "6. Tave, D. 1995. Selective Breeding Programs for Medium Size Fish Farms.FAO Fisheries Technical Paper.\n" +
                        "\n" +
                        "7. Ranga,M.M. and Q.J.Shammi (2005). Fish Biotechnology.Agrobios, India.\n" +
                        "\n" +
                        "8. Itami, T, et. al. (1998).Advanced in shrimp biotechnology.National Centre for Genetic Engineering and Biotechnology. Bangkok.");
                parent.getChildren().add(child3);
            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3210");
                parent.setText2("Course Title: Fisheries and Marine\nBiotechnology practical\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("References:\n" +
                        "\n" +
                        "1.	Harper’s Biochemistry\n" +
                        "\n" +
                        "2.	Neurophysiology-Snell\n" +
                        "\n" +
                        "3.	Principles of Medicine- Davidson\n" +
                        "\n" +
                        "4.	Basic Physiology- Guyton & Hall\n" +
                        "\n" +
                        "5.	Essential of Medical Physiology- K & P Sembulingam");
                parent.getChildren().add(child3);
            }
            else if(i==11){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3213");
                parent.setText2("Course Title: Field Trip\nCredit: 1.00");
                parent.setChildren(new ArrayList<Child>());



                final Child child3 = new Child();
                child3.setName("" + i);
                child3.setText1("");
                parent.getChildren().add(child3);
            }
            else if(i==12){
                parent.setName("" + i);
                parent.setText1("Course Code: BGE 3215");
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
            inflater = LayoutInflater.from(bge32.this);
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

