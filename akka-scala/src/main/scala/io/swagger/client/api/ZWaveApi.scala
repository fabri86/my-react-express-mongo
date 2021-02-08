/**
 * home-iot-api
 * The API for the EatBacon IOT project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.ApiResponse
import io.swagger.client.model.DeviceState
import io.swagger.client.model.LightingSummary
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ZWaveApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : LightingSummary (ok)
   */
  def getLightingSummary(): ApiRequest[LightingSummary] =
    ApiRequest[LightingSummary](ApiMethods.GET, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lightingSummary", "application/json")
      .withSuccessResponse[LightingSummary](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : DeviceState (response)
   * 
   * @param deviceId 
   */
  def getSwitchState(deviceId: String): ApiRequest[DeviceState] =
    ApiRequest[DeviceState](ApiMethods.GET, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lighting/switches/{deviceId}", "application/json")
      .withPathParam("deviceId", deviceId)
      .withSuccessResponse[DeviceState](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : ApiResponse (response)
   * 
   * @param deviceId 
   * @param value 
   */
  def setDimmer(deviceId: String, value: Int): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lighting/dimmers/{deviceId}/{value}", "application/json")
      .withPathParam("deviceId", deviceId)
      .withPathParam("value", value)
      .withSuccessResponse[ApiResponse](200)
        /**
   * sets a dimmer to a specific value on a timer
   * 
   * Expected answers:
   *   code 200 : ApiResponse (response)
   * 
   * @param deviceId 
   * @param value 
   * @param timeunit 
   * @param units 
   */
  def setDimmerTimer(deviceId: String, value: Int, timeunit: Int, units: Option[String]): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lighting/dimmers/{deviceId}/{value}/timer/{timeunit}", "application/json")
      .withQueryParam("units", units)
      .withPathParam("deviceId", deviceId)
      .withPathParam("value", value)
      .withPathParam("timeunit", timeunit)
      .withSuccessResponse[ApiResponse](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : ApiResponse (response)
   * 
   * @param deviceId 
   * @param value 
   */
  def setSwitch(deviceId: String, value: String): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lighting/switches/{deviceId}/{value}", "application/json")
      .withPathParam("deviceId", deviceId)
      .withPathParam("value", value)
      .withSuccessResponse[ApiResponse](200)
        /**
   * sets a switch to a specific value on a timer
   * 
   * Expected answers:
   *   code 200 : ApiResponse (response)
   * 
   * @param deviceId 
   * @param value 
   * @param minutes 
   */
  def setSwitchTimer(deviceId: String, value: String, minutes: Int): ApiRequest[ApiResponse] =
    ApiRequest[ApiResponse](ApiMethods.POST, "https://dev-virtserver.swaggerhub.com/fabri-org/second-test-api/1.0.0", "/lighting/switches/{deviceId}/{value}/timer/{minutes}", "application/json")
      .withPathParam("deviceId", deviceId)
      .withPathParam("value", value)
      .withPathParam("minutes", minutes)
      .withSuccessResponse[ApiResponse](200)
      

}
