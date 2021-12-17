# swagger_client.MainControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_item_to_cart_using_put**](MainControllerApi.md#add_item_to_cart_using_put) | **PUT** /cart/{user_id} | addItemToCart
[**add_item_using_post**](MainControllerApi.md#add_item_using_post) | **POST** /items | addItem
[**del_item_from_cart_using_delete**](MainControllerApi.md#del_item_from_cart_using_delete) | **DELETE** /cart/{user_id} | delItemFromCart
[**del_item_using_delete**](MainControllerApi.md#del_item_using_delete) | **DELETE** /items/{id} | delItem
[**get_cart_using_get**](MainControllerApi.md#get_cart_using_get) | **GET** /cart/{user_id} | getCart
[**get_item_using_get**](MainControllerApi.md#get_item_using_get) | **GET** /items/{id} | getItem
[**get_items_using_get**](MainControllerApi.md#get_items_using_get) | **GET** /items | getItems


# **add_item_to_cart_using_put**
> add_item_to_cart_using_put(request, user_id)

addItemToCart

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
request = swagger_client.ItemToCartRequest() # ItemToCartRequest | request
user_id = 'user_id_example' # str | user_id

try:
    # addItemToCart
    api_instance.add_item_to_cart_using_put(request, user_id)
except ApiException as e:
    print("Exception when calling MainControllerApi->add_item_to_cart_using_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ItemToCartRequest**](ItemToCartRequest.md)| request | 
 **user_id** | [**str**](.md)| user_id | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_item_using_post**
> add_item_using_post(request)

addItem

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
request = swagger_client.CreateItemRequest() # CreateItemRequest | request

try:
    # addItem
    api_instance.add_item_using_post(request)
except ApiException as e:
    print("Exception when calling MainControllerApi->add_item_using_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreateItemRequest**](CreateItemRequest.md)| request | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **del_item_from_cart_using_delete**
> del_item_from_cart_using_delete(request, user_id)

delItemFromCart

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
request = swagger_client.ItemToCartRequest() # ItemToCartRequest | request
user_id = 'user_id_example' # str | user_id

try:
    # delItemFromCart
    api_instance.del_item_from_cart_using_delete(request, user_id)
except ApiException as e:
    print("Exception when calling MainControllerApi->del_item_from_cart_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ItemToCartRequest**](ItemToCartRequest.md)| request | 
 **user_id** | [**str**](.md)| user_id | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **del_item_using_delete**
> del_item_using_delete(id)

delItem

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
id = 'id_example' # str | id

try:
    # delItem
    api_instance.del_item_using_delete(id)
except ApiException as e:
    print("Exception when calling MainControllerApi->del_item_using_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cart_using_get**
> list[CartItemDto] get_cart_using_get(user_id)

getCart

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
user_id = 'user_id_example' # str | user_id

try:
    # getCart
    api_response = api_instance.get_cart_using_get(user_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MainControllerApi->get_cart_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | [**str**](.md)| user_id | 

### Return type

[**list[CartItemDto]**](CartItemDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_item_using_get**
> ItemDto get_item_using_get(id)

getItem

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()
id = 'id_example' # str | id

try:
    # getItem
    api_response = api_instance.get_item_using_get(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MainControllerApi->get_item_using_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**str**](.md)| id | 

### Return type

[**ItemDto**](ItemDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_items_using_get**
> CollectionModelItemDto get_items_using_get()

getItems

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.MainControllerApi()

try:
    # getItems
    api_response = api_instance.get_items_using_get()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MainControllerApi->get_items_using_get: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionModelItemDto**](CollectionModelItemDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

