import requests
import json

from tkinter import *
from tkinter import ttk
from tkinter import scrolledtext

# 6160e7a9-811a-4873-89dc-b42cc170302e

catalog = []
cart = []

def open_from_catalog():
    win = Tk()
    win.geometry("400x400")
    win.title("Описание товара")

    name_label1 = Label(win, text='Название')
    name_label2 = Label(win, text=catalog[catalog_listbox.curselection()[0]]['name'])
    description_label1 = Label(win, text='Описание')
    description_label2 = Label(win, text=catalog[catalog_listbox.curselection()[0]]['description'])
    price_label1 = Label(win, text='Цена')
    price_label2 = Label(win, text=str(catalog[catalog_listbox.curselection()[0]]['name']))

    name_label1.pack()
    name_label2.pack()
    description_label1.pack()
    description_label2.pack()
    price_label1.pack()
    price_label2.pack()


    win.mainloop()



def add_to_cart():
    if len(user_id_entry1.get()) == 0 or len(catalog_listbox.curselection()) == 0:
        return
    res = requests.put(f'http://localhost:8080/cart/{user_id_entry1.get()}',  json={'id': catalog[catalog_listbox.curselection()[0]]['id']})
    print(res)
    update_cart()

def update_catalog():
    global catalog
    api_response = requests.get('http://localhost:8080/items/')
    catalog = api_response.json()['content']
    catalog_listbox.delete(0, catalog_listbox.size())
    for item in catalog:
        catalog_listbox.insert(END, item['name'])

def open_from_cart():
    win = Tk()
    win.geometry("400x400")
    win.title("Описание товара")

    catalog = requests.get('http://localhost:8080/items/').json()['content']
    cart_item = ''
    for item in catalog:
        print(item['id'], cart[cart_listbox.curselection()[0]]['item_id'])
        if item['id'] == cart[cart_listbox.curselection()[0]]['item_id']:
            cart_item = item
            break
    if cart_item == '':
        return

    name_label1 = Label(win, text='Название')
    name_label2 = Label(win, text=item['name'])
    description_label1 = Label(win, text='Описание')
    description_label2 = Label(win, text=item['description'])
    price_label1 = Label(win, text='Цена')
    price_label2 = Label(win, text=str(item['name']))

    name_label1.pack()
    name_label2.pack()
    description_label1.pack()
    description_label2.pack()
    price_label1.pack()
    price_label2.pack()

    win.mainloop()

def del_from_cart():
    if len(user_id_entry2.get()) == 0 or len(cart_listbox.curselection()) == 0:
        return
    res = requests.delete(f'http://localhost:8080/cart/{user_id_entry2.get()}',
                       json={'id': cart[cart_listbox.curselection()[0]]['id']})
    print(res)
    update_cart()

def update_cart():
    global cart
    if len(user_id_entry2.get()) == 0:
        return
    api_response = requests.get(f'http://localhost:8080/cart/{user_id_entry2.get()}')
    cart = api_response.json()
    cart_listbox.delete(0, cart_listbox.size())
    catalog = requests.get('http://localhost:8080/items/').json()['content']
    for cart_item in cart:
        for cat_item in catalog:
            if cart_item['item_id'] == cat_item['id']:
                cart_listbox.insert(END, cat_item['name'])

def add_item():
    if len(name_entry.get()) == 0 or description_entry.size() == 0 or len(price_entry.get()) == 0:
        return
    res = requests.post('http://localhost:8080/items/', json={'name': name_entry.get(), 'description': description_entry.get("1.0", END), 'price': float(price_entry.get())})
    print(res)

def del_item():
    if len(item_id_entry.get()) == 0:
        return
    res = requests.delete(f'http://localhost:8080/items/{item_id_entry.get()}')
    print(res)

# Создание главного окна
window = Tk()
window.title("REST client")
window.geometry('500x500')

# Создание вкладок
tab_control = ttk.Notebook(window)
tab1 = ttk.Frame(tab_control)
tab_control.add(tab1, text='Каталог')
tab2 = ttk.Frame(tab_control)
tab_control.add(tab2, text='Корзина')
tab3 = ttk.Frame(tab_control)
tab_control.add(tab3, text='Добавить элемент')
tab4 = ttk.Frame(tab_control)
tab_control.add(tab4, text='Удалить элемент')
tab_control.pack(expand=1, fill='both')

# Создание вкладки каталога
catalog_listbox = Listbox(tab1, height=30, width=50)
catalog_listbox.insert(END, 'хуй')
catalog_listbox.insert(END, 'залупа')
catalog_listbox.insert(END, 'пенис')
open_button1 = ttk.Button(tab1, text='Открыть', command=open_from_catalog)
add_to_cart_button = ttk.Button(tab1, text='Добавить в корзину', command=add_to_cart)
update_button1 = ttk.Button(tab1, text='Обновить', command=update_catalog)
user_id_label1 = Label(tab1, text='id пользователя')
user_id_entry1 = Entry(tab1)

catalog_listbox.grid(column=0, row=0, columnspan=1, rowspan=5)
open_button1.grid(column=1, row=0)
add_to_cart_button.grid(column=1, row=1)
update_button1.grid(column=1, row=2)
user_id_label1.grid(column=1, row=3)
user_id_entry1.grid(column=1, row=4)

# Создание вкладки корзины
cart_listbox = Listbox(tab2, height=30, width=50)
cart_listbox.insert(END, 'хуй')
cart_listbox.insert(END, 'залупа')
cart_listbox.insert(END, 'пенис')
open_button2 = ttk.Button(tab2, text='Открыть', command=open_from_cart)
del_from_cart_button = ttk.Button(tab2, text='Удалить из корзины', command=del_from_cart)
update_button2 = ttk.Button(tab2, text='Обновить', command=update_cart)
user_id_label2 = Label(tab2, text='id пользователя')
user_id_entry2 = Entry(tab2)

cart_listbox.grid(column=0, row=0, columnspan=1, rowspan=5)
open_button2.grid(column=1, row=0)
del_from_cart_button.grid(column=1, row=1)
update_button2.grid(column=1, row=2)
user_id_label2.grid(column=1, row=3)
user_id_entry2.grid(column=1, row=4)

# Создание вкладки добавления элемента
name_label = Label(tab3, text='Название')
name_entry = Entry(tab3)
description_label = Label(tab3, text='Описание')
description_entry = scrolledtext.ScrolledText(tab3, height=20, width=50)
price_label = Label(tab3, text='Цена')
price_entry = Entry(tab3)
add_item_button = Button(tab3, text='Добавить элемент', command=add_item)

name_label.grid(column=0, row=0)
name_entry.grid(column=0, row=1)
description_label.grid(column=0, row=2)
description_entry.grid(column=0, row=3)
price_label.grid(column=0, row=4)
price_entry.grid(column=0, row=5)
add_item_button.grid(column=0, row=6)

# Создание вкладки удаления элемента
item_id_label = Label(tab4, text='id элемента')
item_id_entry = Entry(tab4)
del_item_button = Button(tab4, text='Удалть элемент', command=del_item)

item_id_label.grid(column=0, row=0)
item_id_entry.grid(column=0, row=1)
del_item_button.grid(column=0, row=2)

# api_response = requests.get('http://localhost:8080/items/')
# pprint(api_response.json())
# pprint(api_response.json()['content'][0]['links'][0]['href'])
# api_response = requests.get(api_response.json()['content'][0]['links'][0]['href'])
# pprint(api_response.json())


window.mainloop()