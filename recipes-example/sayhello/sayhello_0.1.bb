SUMMARY = "SayHello demo"
DESCRIPTION = "SayHello project used in Yocto demo"

# NOTE: Set the License according to the LICENSE file of your project
#       and then add LIC_FILES_CHKSUM accordingly
LICENSE = "CLOSED"

# Assuming the branch is main
# Change <username> accordingly
SRC_URI = "git://git@gitee.com/southwest-north/sayhello.git;branch=master;protocol=ssh;rev=9319fc3c5e772c00d9fe73f7d38e0b661788f4cb"

DEPENDS += "libhello"
RDEPENDS:${PN} += "libhello"

S = "${WORKDIR}/git"

do_install(){
   install -d ${D}/usr/bin
   install -m 0700 sayhello ${D}/usr/bin
}