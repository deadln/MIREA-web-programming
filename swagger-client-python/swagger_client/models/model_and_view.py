# coding: utf-8

"""
    Api Documentation

    Api Documentation  # noqa: E501

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.configuration import Configuration


class ModelAndView(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'empty': 'bool',
        'model': 'object',
        'model_map': 'dict(str, object)',
        'reference': 'bool',
        'status': 'str',
        'view': 'View',
        'view_name': 'str'
    }

    attribute_map = {
        'empty': 'empty',
        'model': 'model',
        'model_map': 'modelMap',
        'reference': 'reference',
        'status': 'status',
        'view': 'view',
        'view_name': 'viewName'
    }

    def __init__(self, empty=None, model=None, model_map=None, reference=None, status=None, view=None, view_name=None, _configuration=None):  # noqa: E501
        """ModelAndView - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._empty = None
        self._model = None
        self._model_map = None
        self._reference = None
        self._status = None
        self._view = None
        self._view_name = None
        self.discriminator = None

        if empty is not None:
            self.empty = empty
        if model is not None:
            self.model = model
        if model_map is not None:
            self.model_map = model_map
        if reference is not None:
            self.reference = reference
        if status is not None:
            self.status = status
        if view is not None:
            self.view = view
        if view_name is not None:
            self.view_name = view_name

    @property
    def empty(self):
        """Gets the empty of this ModelAndView.  # noqa: E501


        :return: The empty of this ModelAndView.  # noqa: E501
        :rtype: bool
        """
        return self._empty

    @empty.setter
    def empty(self, empty):
        """Sets the empty of this ModelAndView.


        :param empty: The empty of this ModelAndView.  # noqa: E501
        :type: bool
        """

        self._empty = empty

    @property
    def model(self):
        """Gets the model of this ModelAndView.  # noqa: E501


        :return: The model of this ModelAndView.  # noqa: E501
        :rtype: object
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this ModelAndView.


        :param model: The model of this ModelAndView.  # noqa: E501
        :type: object
        """

        self._model = model

    @property
    def model_map(self):
        """Gets the model_map of this ModelAndView.  # noqa: E501


        :return: The model_map of this ModelAndView.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._model_map

    @model_map.setter
    def model_map(self, model_map):
        """Sets the model_map of this ModelAndView.


        :param model_map: The model_map of this ModelAndView.  # noqa: E501
        :type: dict(str, object)
        """

        self._model_map = model_map

    @property
    def reference(self):
        """Gets the reference of this ModelAndView.  # noqa: E501


        :return: The reference of this ModelAndView.  # noqa: E501
        :rtype: bool
        """
        return self._reference

    @reference.setter
    def reference(self, reference):
        """Sets the reference of this ModelAndView.


        :param reference: The reference of this ModelAndView.  # noqa: E501
        :type: bool
        """

        self._reference = reference

    @property
    def status(self):
        """Gets the status of this ModelAndView.  # noqa: E501


        :return: The status of this ModelAndView.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this ModelAndView.


        :param status: The status of this ModelAndView.  # noqa: E501
        :type: str
        """
        allowed_values = ["100 CONTINUE", "101 SWITCHING_PROTOCOLS", "102 PROCESSING", "103 CHECKPOINT", "200 OK", "201 CREATED", "202 ACCEPTED", "203 NON_AUTHORITATIVE_INFORMATION", "204 NO_CONTENT", "205 RESET_CONTENT", "206 PARTIAL_CONTENT", "207 MULTI_STATUS", "208 ALREADY_REPORTED", "226 IM_USED", "300 MULTIPLE_CHOICES", "301 MOVED_PERMANENTLY", "302 FOUND", "302 MOVED_TEMPORARILY", "303 SEE_OTHER", "304 NOT_MODIFIED", "305 USE_PROXY", "307 TEMPORARY_REDIRECT", "308 PERMANENT_REDIRECT", "400 BAD_REQUEST", "401 UNAUTHORIZED", "402 PAYMENT_REQUIRED", "403 FORBIDDEN", "404 NOT_FOUND", "405 METHOD_NOT_ALLOWED", "406 NOT_ACCEPTABLE", "407 PROXY_AUTHENTICATION_REQUIRED", "408 REQUEST_TIMEOUT", "409 CONFLICT", "410 GONE", "411 LENGTH_REQUIRED", "412 PRECONDITION_FAILED", "413 PAYLOAD_TOO_LARGE", "413 REQUEST_ENTITY_TOO_LARGE", "414 URI_TOO_LONG", "414 REQUEST_URI_TOO_LONG", "415 UNSUPPORTED_MEDIA_TYPE", "416 REQUESTED_RANGE_NOT_SATISFIABLE", "417 EXPECTATION_FAILED", "418 I_AM_A_TEAPOT", "419 INSUFFICIENT_SPACE_ON_RESOURCE", "420 METHOD_FAILURE", "421 DESTINATION_LOCKED", "422 UNPROCESSABLE_ENTITY", "423 LOCKED", "424 FAILED_DEPENDENCY", "425 TOO_EARLY", "426 UPGRADE_REQUIRED", "428 PRECONDITION_REQUIRED", "429 TOO_MANY_REQUESTS", "431 REQUEST_HEADER_FIELDS_TOO_LARGE", "451 UNAVAILABLE_FOR_LEGAL_REASONS", "500 INTERNAL_SERVER_ERROR", "501 NOT_IMPLEMENTED", "502 BAD_GATEWAY", "503 SERVICE_UNAVAILABLE", "504 GATEWAY_TIMEOUT", "505 HTTP_VERSION_NOT_SUPPORTED", "506 VARIANT_ALSO_NEGOTIATES", "507 INSUFFICIENT_STORAGE", "508 LOOP_DETECTED", "509 BANDWIDTH_LIMIT_EXCEEDED", "510 NOT_EXTENDED", "511 NETWORK_AUTHENTICATION_REQUIRED"]  # noqa: E501
        if (self._configuration.client_side_validation and
                status not in allowed_values):
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def view(self):
        """Gets the view of this ModelAndView.  # noqa: E501


        :return: The view of this ModelAndView.  # noqa: E501
        :rtype: View
        """
        return self._view

    @view.setter
    def view(self, view):
        """Sets the view of this ModelAndView.


        :param view: The view of this ModelAndView.  # noqa: E501
        :type: View
        """

        self._view = view

    @property
    def view_name(self):
        """Gets the view_name of this ModelAndView.  # noqa: E501


        :return: The view_name of this ModelAndView.  # noqa: E501
        :rtype: str
        """
        return self._view_name

    @view_name.setter
    def view_name(self, view_name):
        """Sets the view_name of this ModelAndView.


        :param view_name: The view_name of this ModelAndView.  # noqa: E501
        :type: str
        """

        self._view_name = view_name

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ModelAndView, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ModelAndView):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ModelAndView):
            return True

        return self.to_dict() != other.to_dict()
