package app.vucinicvaso.resumebuilderapp.core.wtoolbox.base.entity

abstract class WTEntity<E>(id: Int?, date: String?) {

    init {
        setId(id);
        setDate(date);
    }

    private var id : Int? = 0;
    fun setId(id: Int?) { this.id = id; }
    fun getId() : Int? { return id; }

    private var date : String? = "";
    fun setDate(date: String?) { this.date = date; }
    fun getDate() : String? { return date; }

}