from PIL import Image

im = Image.open('WhatsApp Image 2024-03-24 at 21.15.27_347338cb.jpg',rb)

width, height = im.size

for i , j in im:
    print(i,j)
