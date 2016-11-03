package utils

import play.api.libs.json.Reads

object CustomReads {
  private val dateFormat = "yyyy-MM-dd'T'HH:mm:ssZ"
  implicit val jodaDateReads = Reads.jodaDateReads(dateFormat)
}
