package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.usecase

abstract class WTUseCaseWithParams<T, P> {

    abstract suspend fun call(params: P) : T;

}