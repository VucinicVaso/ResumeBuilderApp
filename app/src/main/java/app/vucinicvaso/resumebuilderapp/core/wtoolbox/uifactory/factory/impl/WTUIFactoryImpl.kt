package app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.impl

import app.vucinicvaso.resumebuilderapp.core.wtoolbox.uifactory.factory.WTUIFactory

class WTUIFactoryImpl private constructor() : WTUIFactory() {

    companion object {
        val instance : WTUIFactory = WTUIFactoryImpl();
    }

}