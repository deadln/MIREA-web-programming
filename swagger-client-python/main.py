from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint
import requests
import json

from tkinter import *
from tkinter import scrolledtext

window = Tk()
window.title("REST client")
window.geometry('400x250')
txt = scrolledtext.ScrolledText(window, width=40, height=10)
txt.grid(column=0, row=0)

txt.insert(INSERT, 'DO')
txt.insert(INSERT, 'YOU')
txt.insert(INSERT, 'SUCK')
txt.insert(INSERT, 'DICKS?')

# create an instance of the API class
api_instance = swagger_client.MainControllerApi(swagger_client.ApiClient())

try:
    # errorHtml
    # api_response = api_instance.get_items_using_get()
    api_response = requests.get('http://localhost:8080/items/')
    pprint(api_response.json())
    pprint(api_response.json()['content'][0]['links'][0]['href'])
    api_response = requests.get(api_response.json()['content'][0]['links'][0]['href'])
    pprint(api_response.json())
except ApiException as e:
    print("Exception when calling BasicErrorControllerApi->error_html_using_delete: %s\\n" % e)


window.mainloop()