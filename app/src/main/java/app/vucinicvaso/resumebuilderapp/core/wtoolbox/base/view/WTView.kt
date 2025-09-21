package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.view

import androidx.activity.ComponentActivity
import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.WTUIFactory;
import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.impl.WTUIFactoryImpl;

abstract class WTView<VM>(viewModel: VM?) : ComponentActivity() {

    init {
        setViewModel(viewModel);
        setUiFactory();
    }

    private var viewModel : VM? = null;
    private fun setViewModel(vM : VM?) { viewModel = vM; }
    fun getViewModel() : VM? { return viewModel; }

    private var uiFactory : WTUIFactory? = null;
    private fun setUiFactory() { uiFactory = WTUIFactoryImpl.instance; }
    fun getUiFactory() : WTUIFactory? { return uiFactory; }

}