# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A general purpose data downloading library."
HOMEPAGE = "https://github.com/fastai/fastdownload/tree/master/"
# NOTE: License in setup.py/PKGINFO is: Apache Software License 2.0
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
# NOTE: Original package / source metadata indicates license is: Apache
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Apache & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "20507edb8e89406a1fbd7775e6e2a3d81a4dd633dd506b0e9cf0e1613e831d6a"

inherit pypi setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS:${PN} += "python3-fastcore python3-fastprogress"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core python3-crypt python3-pprint"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    fastcore.all
#    fastprogress.fastprogress

PYPI_PACKAGE = "fastdownload"
