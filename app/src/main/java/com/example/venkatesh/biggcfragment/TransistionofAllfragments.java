package com.example.venkatesh.biggcfragment;

import android.app.FragmentManager;
import android.transition.ChangeBounds;
import android.transition.Slide;
import android.view.Gravity;

import com.example.venkatesh.biggcfragment.Fragments.CategoryFragment;
import com.example.venkatesh.biggcfragment.Fragments.FeaaturedOffers;
import com.example.venkatesh.biggcfragment.Fragments.Homefragment;
import com.example.venkatesh.biggcfragment.Fragments.MobilesOffers;
import com.example.venkatesh.biggcfragment.Fragments.OrdersFragment;
import com.example.venkatesh.biggcfragment.Fragments.Specialofferfragment;
import com.example.venkatesh.biggcfragment.Fragments.TodayDeals;
import com.example.venkatesh.biggcfragment.Fragments.WishListFragment;

public class TransistionofAllfragments {
    public void Speialofferfragment(boolean overlap, FragmentManager fm) {
        Specialofferfragment sharedElementFragment2 = new Specialofferfragment();


        Slide slideTransition = new Slide(Gravity.END);
        slideTransition.setDuration(100);
        Slide exitleft=new Slide(Gravity.START);
        exitleft.setDuration(100);
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(exitleft);
        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

       fm.beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }
    public void upcoomingoffer( boolean overlap,FragmentManager  fm) {
        FeaaturedOffers sharedElementFragment2 = new FeaaturedOffers();

        Slide slideTransition = new Slide(Gravity.END);
        slideTransition.setDuration(100);
        Slide exitleft=new Slide(Gravity.START);
        exitleft.setDuration(100);
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(exitleft);
        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }
    public void Catogoryfragment( boolean overlap,FragmentManager fm) {
        CategoryFragment sharedElementFragment2 = new CategoryFragment();

        Slide slideTransition = new Slide(Gravity.END);
        slideTransition.setDuration(100);
        Slide exitleft=new Slide(Gravity.START);
        exitleft.setDuration(100);
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(exitleft);
        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }

    public void mobileofferfragment( boolean overlap,FragmentManager fm) {
        MobilesOffers sharedElementFragment2 = new MobilesOffers();

        Slide slideTransition = new Slide(Gravity.END);
        slideTransition.setDuration(100);
        Slide exitleft=new Slide(Gravity.START);
        exitleft.setDuration(100);
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(exitleft);
        sharedElementFragment2.setAllowReturnTransitionOverlap(overlap);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .addToBackStack(null)
                .commit();
    }
    public void Todaydealsfragment(boolean overlap,FragmentManager fm) {

        TodayDeals deals=new TodayDeals();
        Slide slideTransition = new Slide(Gravity.RIGHT);
        Slide slidetransition=new Slide(Gravity.START);
        slideTransition.setDuration(100);
        slidetransition.setDuration(100);
        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);
        deals.setEnterTransition(slideTransition);
        deals.setAllowEnterTransitionOverlap(overlap);
        deals.setExitTransition(slidetransition);
        deals.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, deals)
                .addToBackStack(null)
                .commit();
    }
    public void Homefraagment( boolean overlap,FragmentManager fm) {

        Homefragment sharedElementFragment2 = new Homefragment();

        Slide slideTransition = new Slide(Gravity.RIGHT);
        Slide slidetransition=new Slide(Gravity.START);
        slideTransition.setDuration(100);
        slidetransition.setDuration(100);


        ChangeBounds changeBoundsTransition = new ChangeBounds();
        changeBoundsTransition.setDuration(100);

        sharedElementFragment2.setEnterTransition(slideTransition);
        sharedElementFragment2.setAllowEnterTransitionOverlap(overlap);
        sharedElementFragment2.setExitTransition(slidetransition);
        sharedElementFragment2.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, sharedElementFragment2)
                .commit();
    }
    public void moveordersfragment(boolean overlap, FragmentManager fm) {
        OrdersFragment cat=new OrdersFragment();
        Slide slideTransition = new Slide(Gravity.RIGHT);
        Slide slidetransition=new Slide(Gravity.START);
        slideTransition.setDuration(100);

        slidetransition.setDuration(100);


        ChangeBounds changeBoundsTransition = new ChangeBounds();
        //  changeBoundsTransition.setDuration(getResources().getInteger(R.integer.anim_duration_medium));

        cat.setEnterTransition(slideTransition);
        cat.setAllowEnterTransitionOverlap(overlap);
        cat.setExitTransition(slidetransition);
        cat.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, cat)
                .addToBackStack(null)
                .commit();
    }
    public void movewishlistfragment(boolean overlap, FragmentManager fm) {
        WishListFragment cat=new WishListFragment();
        Slide slideTransition = new Slide(Gravity.RIGHT);
        Slide slidetransition=new Slide(Gravity.START);
        slideTransition.setDuration(100);

        slidetransition.setDuration(100);


        ChangeBounds changeBoundsTransition = new ChangeBounds();
          changeBoundsTransition.setDuration(100);

        cat.setEnterTransition(slideTransition);
        cat.setAllowEnterTransitionOverlap(overlap);
        cat.setExitTransition(slidetransition);
        cat.setSharedElementEnterTransition(changeBoundsTransition);

        fm.beginTransaction()
                .replace(R.id.Main, cat)
                .addToBackStack(null)
                .commit();
    }

}
