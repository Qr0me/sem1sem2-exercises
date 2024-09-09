import tkinter as tk

root = tk.Tk()

root.geometry("500x500")
root.title("Testings")
root.configure(bg="#17161b")

is_on = True

def text():
     global is_on
     if is_on:
        textLabel.config(text = "The Switch is Off", fg = "grey",  font=('Arial', 30))
        is_on = False

     else: 
        textLabel.config(text = "The Switch is On", fg = "green",  font=('Arial', 30))
        is_on = True

frame = tk.Frame(root)
frame.pack()

bottomframe = tk.Frame(root)
bottomframe.pack( side = tk.BOTTOM )

redbutton = tk.Button(frame, text="Red", fg="red", command= lambda:exit())
redbutton.pack( side = tk.LEFT)

greenbutton = tk.Button(frame, text="Green", fg="Green")
greenbutton.pack( side = tk.LEFT )

bluebutton = tk.Button(frame, text="Blue", fg="blue")
bluebutton.pack( side = tk.LEFT )

blackbutton = tk.Button(bottomframe, text="Black", fg="black", font=('Helvetica', 30, 'bold'), command= lambda:text())
blackbutton.pack( side = tk.BOTTOM)

textLabel = tk.Label(width= 0, height=0)
textLabel.pack()

root.mainloop()