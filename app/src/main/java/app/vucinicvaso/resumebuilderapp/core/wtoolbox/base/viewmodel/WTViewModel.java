package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.viewmodel;

import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.WTUIFactory;
import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.impl.WTUIFactoryImpl;

abstract public class WTViewModel<VM> {

    public WTViewModel() {
        setUiFactory();
    }

    protected VM viewModel;
    void setViewModel(VM v) { viewModel = v; }

    protected WTUIFactory uiFactory;
    void setUiFactory() { uiFactory = WTUIFactoryImpl.Companion.getInstance(); }

}
