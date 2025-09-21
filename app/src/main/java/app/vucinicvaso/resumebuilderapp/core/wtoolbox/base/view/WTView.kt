package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.view

import androidx.activity.ComponentActivity
import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.WTUIFactory;
import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.impl.WTUIFactoryImpl;

abstract class WTView<VM>(viewModel: VM?) : ComponentActivity() {

    init {
        setUiFactory();
    }

    var viewModel : VM? = viewModel;

    var uiFactory : WTUIFactory? = null;
    fun setUiFactory() {
        uiFactory = WTUIFactoryImpl.instance;
    }

}