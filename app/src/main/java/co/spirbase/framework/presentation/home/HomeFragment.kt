package co.spirbase.framework.presentation.home

import android.view.View
import co.spirbase.databinding.FragmentHomeBinding
import co.spirbase.framework.presentation.common.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate,
    HomeViewModel::class.java
) {
    override fun init(view: View) {

    }

    override fun subscribeObserver(view: View) {

    }
}