# New key mappings

## Leader key

- <Space> is our leader key, which indicated for <leader>

## New mappings

### General mapping

- `<leader>ss`: Save File
- `<leader>nn`: New `No Name` File

- `<leader>it`: Open File in the same directory (Hit `<Tab>` to select)

### Quit

- `<leader>wd`: Quit this window (`:q`)
- `<leader>qq`: Quit all windows (`:qa`)
- `<leader>kkk`: Quit this file without saving (`:q!`)

### Movement (m)

- `mb`: Move back (<C-o>)
- `mf`: Move forward (<C-i>)

- `mj`: Move down 10 lines (10j)
- `mk`: Move up 10 lines (10k)

- `mmj`: Page down (<C-u>)
- `mmk`: Page up (<C-k>)

- `mr`: Open `Recent Files` Picker

### Buffers (Tabs)

- `<leader>bb`: To the last tab
- `<leader>ss`: Save this tab

- `<leader>bd`: Close this tab
- `<leader>dd`: Close this tab

- `H`: To the last left tab
- `L`: To the last right tab

- `<C-a>`: Select all

- `<leader>rep`: Replace

Variables:

- <leader>2c: To camel case
- <leader>2u: To snake case (underscore)

Indent:

- `v>`: Tab to the right
- `v<`: Tab to the left

## File Explorer

- `<C-e>`: open File Explorer (`nvim-tree`)

In File Explorer window:

- `o`: open
- `x`: collapse

* `<Enter>`: choose

- `a`: add new file
- `r`: rename with file type
- `e`: rename with the name only
- `d`: delete this file

* `u`: up to the parent directory
* `R`: reload
