SUMMARY = "Hello demo library"
DESCRIPTION = "Hello shared library used in Yocto demo"

# NOTE: Set the License according to the LICENSE file of your project
#       and then add LIC_FILES_CHKSUM accordingly
LICENSE = "CLOSED"

# Assuming the branch is main
# Change <username> accordingly
SRC_URI = "git://git@gitee.com/southwest-north/libhello.git;branch=master;protocol=ssh;rev=9cc1f98e8a1d1128bbaa0ec8a749a9a4e4051fea"

S = "${WORKDIR}/git"

do_install(){
   install -d ${D}${includedir}
   install -d ${D}${libdir}

   install hellolib.h ${D}${includedir}
   oe_soinstall ${PN}.so.${PV} ${D}${libdir}
}