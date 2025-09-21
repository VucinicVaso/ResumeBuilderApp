package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.usecase

abstract class WTUseCase<T> {

    abstract suspend fun call() : T;

}