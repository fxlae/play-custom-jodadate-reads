package controllers

import javax.inject._

import models.FacebookPost
import play.api.libs.json.{JsError, JsSuccess, Json}
import play.api.mvc._

@Singleton
class HomeController @Inject() extends Controller {

  def index = Action {

    val json = Json.parse("""
          {
            "message": "Bla bla bla",
            "updated_time": "2016-09-17T12:48:12+0000"
          }
          """)

    json.validate[FacebookPost] match {
      case JsSuccess(post, _) =>
        Ok(s"Yep, worked. message: ${post.message}, time: ${post.updated_time}")
      case JsError(e) => Ok(s"Didn't work :( ... $e")
    }
  }

}
