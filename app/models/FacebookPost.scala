package models

import org.joda.time.DateTime
import play.api.libs.json.Json

/*
  If you really need play.api.libs.json.Reads._, then import
  play.api.libs.json.Reads.{DefaultJodaDateReads => _, _} instead.
  In this case, we don't need either of them.
 */

final case class FacebookPost(message: String, updated_time: DateTime)

object FacebookPost {
  import utils.CustomReads._
  implicit val reads = Json.reads[FacebookPost]
}
