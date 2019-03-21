package com.iklimahwulan.viewpager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm)
{
    private val pages = listOf(
        first() , second () , Third () , fourth ())

    override fun getItem(position: Int): Fragment
{ return pages[position] }
    override fun getCount(): Int{
        return pages.size
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Pengenalan"
            1 -> "Profil"
            2 -> "Kesibukkan"
        else -> "Hobby"} }
}