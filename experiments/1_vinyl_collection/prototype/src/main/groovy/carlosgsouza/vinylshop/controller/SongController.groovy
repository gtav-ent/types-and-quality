package carlosgsouza.vinylshop.controller

import carlosgsouza.vinylshop.database.DB
import carlosgsouza.vinylshop.model.Vinyl

class SongController {
	
	DB db = DB.connect()
	
	List<String> list() {
		db.songs
	}
	
}